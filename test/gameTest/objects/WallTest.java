package gameTest.objects;

import game.Position;
import game.objects.Wall;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for the Wall class.
 */
public class WallTest {

    /**
     * Tests if it's possible to create a Wall.
     */
    @Test
    public void can_create_Wall () {
        Wall wall = new Wall (new Position(4,6));

        assertEquals(4, wall.getPosition().getxPosition());
        assertEquals(6, wall.getPosition().getyPosition());
        assertEquals(this.getClass().getResource("/resources/sprites/wall.png"), wall.getUrl());
    }
}