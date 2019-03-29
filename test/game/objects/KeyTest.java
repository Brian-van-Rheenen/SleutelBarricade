package game.objects;

import game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {

    @Test
    public void can_create_Key() {
        Key key = new Key(new Position(4,6),100);

        assertEquals(4, key.getPosition().getxPosition());
        assertEquals(6, key.getPosition().getyPosition());
        assertEquals(100, key.getValue());
    }

    @Test
    public void can_read_value() {
        Key key = new Key(new Position(4,6),100);

        assertEquals(100, key.getValue());
    }
}