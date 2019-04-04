package game;

import game.objects.GameObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Component that renders the GameObjects on screen
 */
public class PlayingField extends JPanel {

    private List<GameObject> gameObjects;

    private final double MAX_HEIGHT_CELL_AMOUNT = 10;

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

    /**
     * Checks if the given Position will hit a GameObject on that Position
     * @param position the Position to validate if a GameObject is on that Position
     * @return An Optional that could be collided with the Player
     */
    public Optional<GameObject> willCollide(Position position) {
        for (GameObject object: gameObjects) {
            if(object.getPosition().equals(position)) {
                return Optional.of(object);
            }
        }

        return Optional.empty();
    }
    
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    /**
     * Renders the PlayingField to the screen with all the GameComponents
     * @param g the graphics component to render to the screen
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        double[] sort = { getSize().getHeight(), getSize().getWidth() };
        Arrays.sort(sort);

        // Get the smallest possible element
        double size = sort[0];

        g.setColor(Color.black);

        double cellHeight = (size / MAX_HEIGHT_CELL_AMOUNT);
        int roundedCellHeight = roundDoubleCeil(cellHeight);

        // In order to remove Rounding Error accumulation we use doubles for calculation and round them to ints
        for (double collumn = 0; collumn < cellHeight * MAX_HEIGHT_CELL_AMOUNT; collumn = collumn + cellHeight) {
            // Draw a row
            for (double row = 0; row < cellHeight * MAX_HEIGHT_CELL_AMOUNT; row = row + cellHeight) {

                int roundedCollumn    = roundDoubleCeil(collumn);
                int roundedRow        = roundDoubleCeil(row);


                // Draw the cell
                g.drawRect(roundedCollumn, roundedRow, roundedCellHeight, roundedCellHeight);
            }
        }

        int general = (int) Math.ceil(cellHeight * MAX_HEIGHT_CELL_AMOUNT);
        setPreferredSize(new Dimension(general, general));

        // Draw all the different GameObjects on screen
        for (GameObject gameObject : gameObjects) {

            // Calculate the actual pixel position for the image
            Position pos = gameObject.getPosition();

            int actualX = roundDoubleCeil(cellHeight * pos.getxPosition());
            int actualY = roundDoubleCeil(cellHeight * pos.getyPosition());

            int valueX = (int) Math.round(cellHeight * pos.getxPosition() + 5);
            int valueY = (int) Math.round(cellHeight * pos.getyPosition() + 17);

            try {
                // Load the image from the URL
                Image image = ImageIO.read(gameObject.getUrl());

                // Draw the Image on the screen, resize to the full size of the cell
                g.drawImage(image, actualX, actualY, roundedCellHeight, roundedCellHeight, this);

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

    /**
     * Round the given double to int using ceiling rounding
     * @param value the value to round and convert to int
     * @return the converted value
     */
    private int roundDoubleCeil(double value) {
        return (int) Math.floor(value);
    }
}
