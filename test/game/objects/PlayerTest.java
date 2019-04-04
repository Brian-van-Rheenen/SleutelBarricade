package game.objects;

import game.*;
import game.levels.MockLevel;
import org.junit.Test;

import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void can_create_Player(){
        Player player = new Player(new Position(5,7), new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)) {}));

        assertEquals(5, player.getPosition().getxPosition());
        assertEquals(7, player.getPosition().getyPosition());
    }

    @Test
    public void can_set_currentKey() {
        Player player = new Player(new Position(5,7), new PlayingField(new MockLevel(new LevelManager(new Game(MockLevel.class)), new Game(MockLevel.class)) {}));
        Key key = new Key(new Position(5,6), 100);

        player.setCurrentKey(key.getValue());

        assertEquals(100, player.getCurrentKey());

    }
}