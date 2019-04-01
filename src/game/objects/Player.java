package game.objects;

import game.PlayingField;
import game.Position;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Optional;

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
            Optional<GameObject> collidedObject = playingField.willCollide(newPosition);

            if(collidedObject.isPresent()) {
                GameObject collider = collidedObject.get();

                if(collider instanceof Key) {
                    Key key = (Key) collider;

                    setCurrentKey(key.getValue());

                    playingField.getGameObjects()
                        .remove(collider);

                    move(newPosition);
                } else if (collider instanceof Barricade) {
                    Barricade barricade = (Barricade) collider;

                    if(barricade.tryOpen(getCurrentKey())) {
                        playingField.getGameObjects()
                            .remove(collider);

                        move(newPosition);
                    }
                }


            } else {
                setPosition(newPosition);
                playingField.repaint();
            }
        }


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
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) {
        Position updatedPosition = getPosition();

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_KP_UP:
            case KeyEvent.VK_W:

                move(new Position(updatedPosition.getxPosition(), updatedPosition.getyPosition() - 1));
                break;

            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_KP_DOWN:
            case KeyEvent.VK_S:

                move(new Position(updatedPosition.getxPosition(), updatedPosition.getyPosition() + 1));
                break;

            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_KP_LEFT:
            case KeyEvent.VK_A:

                move(new Position(updatedPosition.getxPosition() - 1, updatedPosition.getyPosition()));
                break;

            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_KP_RIGHT:
            case KeyEvent.VK_D:

                move(new Position(updatedPosition.getxPosition() + 1, updatedPosition.getyPosition()));
                break;
        }
    }
}
