package game.objects;

import game.Position;

public class Wall extends GameObject{

    /**
     * A wall which the player can not pass through
     * @param position the Position of the wall
     */
    public Wall(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/sprites/wall.png"));
    }

}
