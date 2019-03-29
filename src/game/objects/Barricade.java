package game.objects;

import game.Position;

public class Barricade extends GameObject {

    public Barricade(Position position, int value) {
        super(position);
        setValue(value);
        setImage(this.getClass().getResource("/resources/sprites/barricade.png"));
    }

    public boolean tryOpen(int keyValue) {
        return getValue() == keyValue;
    }
}
