package game;

import game.objects.GameObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PlayingField extends JPanel{

    private List<GameObject> gameObjects;

    private final int MAX_HEIGHT_CELL_AMOUNT = 10;

    public PlayingField(List<GameObject> GameObjects) {
        setLayout(new GridBagLayout());

        this.gameObjects = GameObjects;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        double[] sort = { getSize().getHeight(), getSize().getWidth() };
        Arrays.sort(sort);

        // Get the smallest possible element
        double size = sort[0];

        g.setColor(Color.black);

        Number cellHeight = (size / (double) MAX_HEIGHT_CELL_AMOUNT);


        for(int collumn = 0; collumn < cellHeight.intValue() * MAX_HEIGHT_CELL_AMOUNT; collumn = collumn + cellHeight.intValue()) {
            // Draw a row
            for(int row = 0; row < cellHeight.intValue() * MAX_HEIGHT_CELL_AMOUNT; row = row + cellHeight.intValue()) {

                // Draw the cell
                g.drawRect(collumn, row, cellHeight.intValue(), cellHeight.intValue());
            }
        }

        // Draw all the different GameObjects on screen
        for (GameObject gameObject : gameObjects) {

            // Calculate the actual pixel position for the image
            Position pos = gameObject.getPosition();

            int actualX = cellHeight.intValue() * pos.getxPosition();
            int actualY = cellHeight.intValue() * pos.getyPosition();

            try {
                // Load the image from the URL
                Image image = ImageIO.read(gameObject.getUrl());

                // Draw the Image on the screen, resize to the full size of the cell
                g.drawImage(image, actualX, actualY, cellHeight.intValue(), cellHeight.intValue(), this);

            } catch (IOException ex) {
                // We were unable to load the image from the source
                // Ignore the object and continue
                continue;
            }
        }
    }
}
