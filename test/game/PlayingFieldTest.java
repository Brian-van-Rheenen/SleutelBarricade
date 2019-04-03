package game;

import game.levels.MockLevel;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayingFieldTest {

    @Test
    public void can_keep_player_within_boundaries() {
        PlayingField playingField = new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)));

        assertEquals(false, playingField.isWithinBoundaries(new Position(-1,0)));
    }
}