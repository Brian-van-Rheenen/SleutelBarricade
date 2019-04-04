/**
 * Contains custom GUI objects used by the game
 */
package game.components;

import game.Game;
import game.Level;
import game.LevelManager;

import javax.swing.*;

/**
 * A side menu which contains interactable buttons to restart and end the game.
 */
public class SideMenu extends JPanel {

    /**
     * Center panel:
     *  - The centered panel that contains all the interactable buttons.
     *
     * @param levelManager The current active levelManager for button events.
     * @param currentLevel The current level to restart the level.
     * @param game The game object needed to quit the game.
     */
    public SideMenu(LevelManager levelManager, Class<? extends Level> currentLevel, Game game) {
        super();

        // Center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalStrut(25));

        centerPanel.add(new GameButton("Restart", (e) -> levelManager.load(currentLevel)));
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(new GameButton("Exit", (e) -> game.exit()));

        add(centerPanel);
    }
}


