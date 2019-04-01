package game;

import game.levels.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class LevelManager {
    private Map<String, Callable<Level>> levels = new HashMap<>();
    private Game game;

    public LevelManager(Game game) {
        this.game = game;

        levels.put("MainMenu", () -> new MainMenu(this, game));
        levels.put("Level1", () -> new Level1(this, game));
    }

    public void load(String identifier) {
        try {
            Level level = levels.get(identifier).call();
            game.loadLevel(level.constructLevel());
        } catch (Exception e) {
            System.err.printf("Level Load Failure: %s", e.toString());
        }
    }
}
