package game.objects;

import game.PlayingField;
import game.Position;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * The player object that the user controls
 */
public class Player extends GameObject implements KeyListener {

    private int currentKey;
    private PlayingField playingField;

    public Player(Position position, PlayingField field) {
        super(position);
        playingField = field;

        setFocusable(true);
        setImage(this.getClass().getResource("/resources/sprites/player.png"));
    }

    // TODO: Write method move
    // Think about the boundaries! Position has a minimal value of 0,0 and a maximum value of however big the playing field is minus one!
    private void move(Position newPosition){
        Position position = getPosition();

        if(playingField.isWithinBoundaries(newPosition)) {
            // TODO: Check if we have collided with an object in the playingField
            position = newPosition;
        }


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

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {

        Position updatedPosition = getPosition();

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_KP_UP:

                move(new Position(updatedPosition.getxPosition(), updatedPosition.getyPosition() - 1));
                break;

            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_KP_DOWN:

                move(new Position(updatedPosition.getxPosition(), updatedPosition.getyPosition() + 1));
                break;

            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_KP_LEFT:

                move(new Position(updatedPosition.getxPosition() - 1, updatedPosition.getyPosition()));
                break;

            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_KP_RIGHT:

                move(new Position(updatedPosition.getxPosition() + 1, updatedPosition.getyPosition()));
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}
