package game;

import game.levels.*;
import java.util.HashMap;
import java.util.Map;

public class LevelManager {
    Map<String, Level> levels = new HashMap<>();

    public LevelManager() {
        levels.put("MainMenu", new MainMenu(this));
    }

    public void load(String identifier) {
        levels.get(identifier);
    }
}
