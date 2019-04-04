package game.objects;

import game.PlayingField;
import game.Position;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Optional;

public class Player extends GameObject implements KeyListener {

    private int currentKey;
    private PlayingField playingField;

    /**
     * A playable character in the game
     * @param position the Position of the player
     * @param field the PlayingField in which the player is located
     */
    public Player(Position position, PlayingField field) {
        super(position);
        playingField = field;

        setFocusable(true);
        setImage(this.getClass().getResource("/resources/sprites/player.png"));
    }

    /**
     * Move the player to a new position, and interact with any GameObjects in the world
     * @param newPosition the position to move to
     */
    private void move(Position newPosition) {
        if(playingField.isWithinBoundaries(newPosition)) {
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
                } else if (collider instanceof Goal) {
                    Goal goal = (Goal) collider;
                    // Execute the action on level end
                    goal.getGoalHit().run();

                    playingField.getGameObjects()
                            .remove(collider);
                }


            } else {
                setPosition(newPosition);
                playingField.repaint();
            }
        }


    }

    /**
     * Get the value of the key currently in the pocket of the player
     * @return the value of the pocketed key
     */
    public int getCurrentKey() {
        return currentKey;
    }

    /**
     * Set the value of the key that is going in the pocket of the player
     * @param currentKey the value of the new key
     */
    public void setCurrentKey(int currentKey) {
        this.currentKey = currentKey;
    }

    /**
     * Currently not used in the game, but necessary for method KeyReleased to work
     * @param e the event of a typed key on the keyboard
     */
    @Override
    public void keyTyped(KeyEvent e) { }

    /**
     * Currently not used in the game, but necessary for method KeyReleased to work
     * @param e the event of a pressed key on the keyboard
     */
    @Override
    public void keyPressed(KeyEvent e) { }

    /**
     * Listen to the different key pressed on the user's keyboard. This is used for movement of the player
     * @param e the event of a keypress
     */
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
