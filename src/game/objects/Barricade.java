/**
 * Contains all the GameObjects that are being used by the game.
 */
package game.objects;

import game.Position;

public class Barricade extends GameObject {

    /**
     * A barricade which can be opened with a key containing the corresponding value
     * @param position the Position of the barricade
     * @param value the internal value of the barricade
     */
    public Barricade(Position position, int value) {
        super(position);
        setValue(value);
        setImage(this.getClass().getResource("/resources/sprites/barricade.png"));
    }

    /**
     * Try to be opened if the value of the used key is the same as the internal value of the barricade
     * @param keyValue the value of the used key
     * @return true if the key can open the barricade
     */
    public boolean tryOpen(int keyValue) {
        return getValue() == keyValue;
    }
}
