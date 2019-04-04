package game;

import game.objects.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The template for every other level
 */
public abstract class Level extends JPanel {

    protected Game game;
    protected LevelManager levelManager;
    protected List<GameObject> gameObjects = new ArrayList<>();

    /**
     * Template for every other level, initializes the Game and the LevelManager instances
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

    /**
     * Set the background color of ALL JPanels by iterating through all components that are an instance of JPanel.
     * @param containerPanel The container panel that contains all present elements in the main menu.
     */
    public void setPanelBackgrounds(JPanel containerPanel, Color color) {

        // Loop through all components of the given JPanel
        for (Component component: containerPanel.getComponents()) {

            // If this component is an instance of a JPanel
            if (component instanceof JPanel) {

                // Set the background color
                component.setBackground(color);

                // If this JPanel has any more child components that are an instance of JPanel
                if(component instanceof JPanel) {

                    // Recur
                    setPanelBackgrounds((JPanel) component, color);
                }
            }
        }
    }
}
