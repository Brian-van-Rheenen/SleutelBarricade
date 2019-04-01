package game;

import game.levels.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class LevelManager {
    private Map<Class<? extends Level>, Callable<Level>> levels = new HashMap<>();
    private Game game;

    public LevelManager(Game game) {
        this.game = game;

        levels.put(MainMenu.class, () -> new MainMenu(this, game));
        levels.put(Level1.class, () -> new Level1(this, game));
    }

    public void load(Class<? extends Level> levelIdentifier) {
        try {
            Level level = levels.get(levelIdentifier).call();
            game.loadLevel(level.constructLevel());
        } catch (Exception e) {
            System.err.printf("Level Load Failure: %s", e.toString());
        }
    }
}
