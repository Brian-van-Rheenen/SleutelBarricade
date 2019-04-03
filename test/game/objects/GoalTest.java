package game.objects;

import game.Position;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoalTest {

    @Test
    public void can_create_Goal () {
        Goal goal = new Goal (new Position(4,6), () -> {});

        assertEquals(4, goal.getPosition().getxPosition());
        assertEquals(6, goal.getPosition().getyPosition());
        assertEquals(this.getClass().getResource("/resources/sprites/goal.png"), goal.getUrl());
    }

}