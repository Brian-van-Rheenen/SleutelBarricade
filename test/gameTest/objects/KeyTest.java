package gameTest.objects;

import game.Position;
import game.objects.Key;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the Key class.
 */
public class KeyTest {

    /**
     * Tests if it's possible to create a Key.
     */
    @Test
    public void can_create_Key() {
        Key key = new Key(new Position(4,6),100);

        assertEquals(4, key.getPosition().getxPosition());
        assertEquals(6, key.getPosition().getyPosition());
        assertEquals(100, key.getValue());
    }

    /**
     * Tests if it's possible to read the value of a specific key.
     */
    @Test
    public void can_read_value() {
        Key key = new Key(new Position(4,6),100);

        assertEquals(100, key.getValue());
    }
}