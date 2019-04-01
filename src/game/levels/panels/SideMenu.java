package game.levels.panels;

import game.Level;
import game.LevelManager;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SideMenu extends JPanel {

    public SideMenu(LevelManager levelManager, Class<? extends Level> currentLevel) {
        super();

        JButton sideMenuButton = new JButton("Restart");
        sideMenuButton.setPreferredSize(new Dimension(220, 50));
        sideMenuButton.setBackground(new Color(244, 194, 66));
        sideMenuButton.setFont(new Font("8BIT WONDER", Font.PLAIN, 28));
        sideMenuButton.setForeground(Color.WHITE);
        sideMenuButton.setBorder(new LineBorder(new Color(122, 122, 122)));
        sideMenuButton.setFocusPainted(false);
        sideMenuButton.addActionListener((e) -> {
            levelManager.load(currentLevel);
        });

        add(sideMenuButton);
    }
}


