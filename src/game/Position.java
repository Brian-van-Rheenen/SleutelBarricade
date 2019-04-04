package game;

/**
 * Represents X and Y coordinates in a finite grid
 */
public class Position {

    private int xPosition;
    private int yPosition;

    /**
     * A position containing of X and Y coordinates in a finite grid
     * @param xPosition the X coordinate of the object
     * @param yPosition the Y coordinate of the object
     */
    public Position(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * Get the X coordinate of the position
     * @return the X coordinate
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Get the Y coordinate of the position
     * @return the Y coordinate
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Check if both the X and Y coordinates are the same for both objects
     * @return true if the X and Y of both objects are the same
     */
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Position) {
            Position otherPosition = (Position) obj;
            return getxPosition() == otherPosition.getxPosition() && getyPosition() == otherPosition.getyPosition();
        } else {
            return false;
        }

    }

}
