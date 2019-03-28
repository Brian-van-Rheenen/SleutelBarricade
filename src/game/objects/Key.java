package game.objects;

import game.Position;

public class Key extends GameObject {

    int value;

    public Key(Position position, int value) {
        super(position);
        this.value = value;
        setImage(this.getClass().getResource("/resources/sprites/key.png"));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
