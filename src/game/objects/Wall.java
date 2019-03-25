package game.objects;

import game.Position;

public class Wall extends GameObject{

    public Wall(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/wall.png"));
    }

}
