package game.objects;

import game.Position;

public class Empty extends GameObject {

    /**
     * This class is used for the empty places in the grid used on the start-up in a level.
     * @param position
     */
    public Empty(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/empty.png"));
    }
}
