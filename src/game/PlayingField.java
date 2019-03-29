package game;

import game.objects.GameObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PlayingField extends JPanel {

    private List<GameObject> gameObjects;

    private final int MAX_HEIGHT_CELL_AMOUNT = 10;

    public PlayingField(Level level) {
        setLayout(new GridBagLayout());

        this.gameObjects = level.getGameObjects();
    }

    /**
     * Check if the given position is within the playing field boundaries
     * @param position The position to validate against the boundaries
     * @return true if the position is within the boundaries
     */
    public boolean isWithinBoundaries(Position position) {
        if (position.getyPosition() < 0 || position.getyPosition() > MAX_HEIGHT_CELL_AMOUNT - 1){
            return false;
        } else if (position.getxPosition() < 0 || position.getxPosition() > MAX_HEIGHT_CELL_AMOUNT - 1){
            return false;
        }

        return true;
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

            int valueX = cellHeight.intValue() * pos.getxPosition() + 5;
            int valueY = cellHeight.intValue() * pos.getyPosition() + 17;

            try {
                // Load the image from the URL
                Image image = ImageIO.read(gameObject.getUrl());

                // Draw the Image on the screen, resize to the full size of the cell
                g.drawImage(image, actualX, actualY, cellHeight.intValue(), cellHeight.intValue(), this);

                // If the GameObject has a value
                if(gameObject.getValue() > 0) {
                    // Create a string with its value in the top left of the cell
                    g.setFont(new Font("VCR OSD Mono", Font.PLAIN, 16));
                    g.drawString(Integer.toString(gameObject.getValue()), valueX, valueY);
                }

            } catch (IOException ex) {
                // We were unable to load the image from the source
                // Ignore the object and continue
                continue;
            }
        }
    }
}
