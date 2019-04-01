package game;

/**
 * A coordinate in a finite grid
 */
public class Position {

    private int xPosition;
    private int yPosition;

    public Position(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

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
