package game.objects;

import game.Position;

public class Key extends GameObject {

    public Key(Position position, int value) {
        super(position);
        setValue(value);
        setImage(this.getClass().getResource("/resources/sprites/key.png"));
    }
}
