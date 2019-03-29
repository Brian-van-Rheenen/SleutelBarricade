package game.objects;

import game.Position;

public class Barricade extends GameObject {

    public Barricade(Position position, int value) {
        super(position);
        setValue(value);
        setImage(this.getClass().getResource("/resources/sprites/barricade.png"));
    }

    // TODO: Write tryOpen method for matching the value of player's currentKey
    //       to the value of the barricade the player is trying to open.
    public boolean tryOpen(){
        return false;
    }

}
