package game;

import game.objects.GameObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Level extends JPanel {

    protected Game game;
    protected LevelManager levelManager;
    protected List<GameObject> gameObjects = new ArrayList<>();

    /**
     * Template for every other level
     * @param levelManager manages all the levels
     * @param game contains all the levels
     */
    public Level(LevelManager levelManager, Game game) {
        this.game = game;
        this.levelManager = levelManager;
    }

    /**
     * Construct the level
     * @return A JPanel with a fully constructed level
     */
    public abstract JPanel constructLevel();

    /**
     * Get the GameObjects in a level
     * @return the list of multiple GameObjects
     */
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
