package game;

import game.levels.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class LevelManager {
    private Map<Class<? extends Level>, Callable<Level>> levels = new HashMap<>();
    private Game game;

    /**
     * Manage the different levels in the game
     * @param game the game in which the levels are managed
     */
    public LevelManager(Game game) {
        this.game = game;

        levels.put(MainMenu.class, () -> new MainMenu(this, game));
        levels.put(Level1.class, () -> new Level1(this, game));
        levels.put(Level2.class, () -> new Level2(this, game));

        // End screen
        levels.put(EndScreen.class, () -> new EndScreen(this, game));

        // Level specifically ceated for Unittesting
        levels.put(MockLevel.class, () -> new MockLevel(this, game));
    }

    /**
     * Try to load a level
     * @param levelIdentifier the level that is trying to be loaded
     */
    public void load(Class<? extends Level> levelIdentifier) {
        try {
            Level level = levels.get(levelIdentifier).call();
            game.loadLevel(level.constructLevel());
        } catch (Exception e) {
            System.err.printf("Level Load Failure: %s", e.toString());
        }
    }
}
