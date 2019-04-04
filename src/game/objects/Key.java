package game.objects;

import game.Position;

/**
 * The key to open a {@link Barricade} with
 */
public class Key extends GameObject {

    /**
     * A Key that can be picked up by the player and can be used to open certain barricades
     * @param position the Position of the key
     * @param value the internal value of the key
     */
    public Key(Position position, int value) {
        super(position);
        setValue(value);
        setImage(this.getClass().getResource("/resources/sprites/key.png"));
    }
}
