package game;

import game.objects.GameObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Level extends JPanel {

    protected Game game;
    protected LevelManager levelManager;
    protected List<GameObject> gameObjects = new ArrayList<>();

    public Level(LevelManager levelManager, Game game) {
        this.game = game;
        this.levelManager = levelManager;
    }

    /**
     * Construct the level
     * @return A JPanel with a fully constructed level
     */
    public abstract JPanel constructLevel();

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
