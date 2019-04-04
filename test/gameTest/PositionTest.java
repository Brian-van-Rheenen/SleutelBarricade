package gameTest;

import game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the Position class.
 */
public class PositionTest {

    /**
     * Tests if it's possible to create a new Position.
     */
    @Test
    public void can_create_Position () {
        Position position = new Position(4,6);

        assertEquals(4, position.getxPosition());
        assertEquals(6, position.getyPosition());
    }

    /**
     * Tests if the X coordinate of a position can be read.
     */
    @Test
    public void can_read_xPosition() {
        Position position = new Position(4,6);

        assertEquals(4, position.getxPosition());
    }

    /**
     * Tests if the Y coordinate of a position can be read.
     */
    @Test
    public void can_read_yPosition() {
        Position position = new Position(4,6);

        assertEquals(6, position.getyPosition());
    }
}