package game.components;

import game.Level;
import game.LevelManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SideMenu extends JPanel {

    /**
     * A side menu containing different buttons
     * @param levelManager manages the level in which the side menu is used
     * @param currentLevel the current level in which the side menu is used
     */
    public SideMenu(LevelManager levelManager, Class<? extends Level> currentLevel) {
        super();

        add(new GameButton("Restart", (e) -> levelManager.load(currentLevel)));
        add(new GameButton("Quit"));
    }
}


