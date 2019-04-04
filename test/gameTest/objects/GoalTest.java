package gameTest.objects;

import game.Position;
import game.objects.Goal;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for the Goal class.
 */
public class GoalTest {

    /**
     * Tests if it's possible to create a Goal.
     */
    @Test
    public void can_create_Goal () {
        Goal goal = new Goal (new Position(4,6), () -> {});

        assertEquals(4, goal.getPosition().getxPosition());
        assertEquals(6, goal.getPosition().getyPosition());
        assertEquals(this.getClass().getResource("/resources/sprites/goal.png"), goal.getUrl());
    }

}