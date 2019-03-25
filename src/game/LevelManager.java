package game;

import game.levels.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class LevelManager {
    private Map<String, Level> levels = new HashMap<>();
    private Game game;

    public LevelManager(Game game) {
        this.game = game;

        levels.put("MainMenu", new MainMenu(this));
        levels.put("Level1", new Level1(this));
    }

    public void load(String identifier) {
        Level level = levels.get(identifier);
        game.loadLevel(level.getPanel());
    }
}
