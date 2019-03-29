package game.objects;

import game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class WallTest {

    @Test
    public void can_create_Wall () {
        Wall wall = new Wall (new Position(4,6));

        assertEquals(4, wall.getPosition().getxPosition());
        assertEquals(6, wall.getPosition().getyPosition());
        assertEquals(this.getClass().getResource("/resources/sprites/wall.png"), wall.getUrl());
    }
}