package game.objects;

import game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarricadeTest {

    @Test
    public void can_create_Barricade() {
        Barricade barricade = new Barricade(new Position(4,6),100);

        assertEquals(4, barricade.getPosition().getxPosition());
        assertEquals(6, barricade.getPosition().getyPosition());
        assertEquals(100, barricade.getValue());
        }

    @Test
    public void can_be_opened() {

    }
}