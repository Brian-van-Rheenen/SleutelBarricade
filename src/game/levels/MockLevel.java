package game.levels;

import game.*;
import game.objects.*;

import javax.swing.*;

public class MockLevel extends Level {

    /**
     * This level is created for testing
     * @param levelManager manages the level
     * @param game contains the level (only for testing)
     */
    public MockLevel(LevelManager levelManager, Game game) {
        super(levelManager, game);
    }

    /**
     * Constructs the level
     * @return a JPanel that contains the constructed level
     */
    @Override
    public JPanel constructLevel() {
        PlayingField field = new PlayingField(this);

        // Create player and register for keyboard input with the KeyListener
        Player player = new Player(new Position(5,5), field);

        game.AttachKeyListener(player);
        add(player);

        gameObjects.add(player);

        return field;
    }
}
