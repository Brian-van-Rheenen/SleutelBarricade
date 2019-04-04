package gameTest.objects;

import game.*;
import game.levels.MockLevel;
import game.objects.Key;
import game.objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the Player class.
 */
public class PlayerTest {

    /**
     * Tests if it's possible to create a Player.
     */
    @Test
    public void can_create_Player(){
        Player player = new Player(new Position(5,7), new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)) {}));

        assertEquals(5, player.getPosition().getxPosition());
        assertEquals(7, player.getPosition().getyPosition());
    }

    /**
     * Tests if it's possible to 'pick up' a key and change the value of the key in the 'pocket' of the player.
     */
    @Test
    public void can_set_currentKey() {
        Player player = new Player(new Position(5,7), new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)) {}));
        Key key = new Key(new Position(5,6), 100);

        player.setCurrentKey(key.getValue());

        assertEquals(100, player.getCurrentKey());
    }
}