package gameTest.objects;

import game.Position;
import game.objects.Barricade;
import game.objects.Key;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the Barricade class.
 */
public class BarricadeTest {

    /**
     * Tests if it's possible to create a Barricade.
     */
    @Test
    public void can_create_Barricade() {
        Barricade barricade = new Barricade(new Position(4,6),100);

        assertEquals(4, barricade.getPosition().getxPosition());
        assertEquals(6, barricade.getPosition().getyPosition());
        assertEquals(100, barricade.getValue());
        }

    /**
     * Tests if the barricade can be opened with the right key.
     */
    @Test
    public void can_be_opened() {
        Barricade barricade = new Barricade(new Position(4,6),100);
        Key key1 = new Key(new Position(4,5), 200);
        Key key2 = new Key(new Position(4,4), 100);

        assertEquals(false, barricade.tryOpen(key1.getValue()));
        assertEquals(true, barricade.tryOpen(key2.getValue()));

    }
}