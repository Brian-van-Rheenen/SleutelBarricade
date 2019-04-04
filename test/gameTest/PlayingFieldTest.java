package gameTest;

import game.Game;
import game.LevelManager;
import game.PlayingField;
import game.Position;
import game.levels.MockLevel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for the PlayingField class.
 */
public class PlayingFieldTest {

    /**
     * Tests if it's possible to keep the player within the boundaries of the finite playingField
     */
    @Test
    public void can_keep_player_within_boundaries() {
        PlayingField playingField = new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)));

        assertEquals(false, playingField.isWithinBoundaries(new Position(-1,0)));
    }
}