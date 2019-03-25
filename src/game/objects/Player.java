package game.objects;

import game.Position;

public class Player extends GameObject{

    private int currentKey;

    public Player(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/player.png"));
    }

    // TODO: Write method move
    // Think about the boundaries! Position has a minimal value of 0,0 and a maximum value of however big the playing field is minus one!
    public void move(){

    }

    // TODO: Write method pickUpKey, which is used to change the currentKey value.
    public void pickUpKey(){

    }

    // TODO: Write method dropKey
    public void dropKey(){

    }

    public int getCurrentKey() {
        return currentKey;
    }

    public void setCurrentKey(int currentKey) {
        this.currentKey = currentKey;
    }

}
