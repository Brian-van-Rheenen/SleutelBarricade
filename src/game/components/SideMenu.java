package game.components;

import game.Level;
import game.LevelManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SideMenu extends JPanel {

    public SideMenu(LevelManager levelManager, Class<? extends Level> currentLevel) {
        super();

        add(new GameButton("Restart", (e) -> levelManager.load(currentLevel)));
        add(new GameButton("Quit"));
    }
}


