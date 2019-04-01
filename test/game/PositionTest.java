package game;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void can_create_Position () {
        Position position = new Position(4,6);

        assertEquals(4, position.getxPosition());
        assertEquals(6, position.getyPosition());
    }

    @Test
    public void can_read_xPosition() {
        Position position = new Position(4,6);

        assertEquals(4, position.getxPosition());
    }

    @Test
    public void can_read_yPosition() {
        Position position = new Position(4,6);

        assertEquals(6, position.getyPosition());
    }
}