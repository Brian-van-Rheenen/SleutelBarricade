package game.levels;

import game.Level;
import game.LevelManager;

import javax.swing.*;

/**
 * The main menu of the game.
 */
public class MainMenu extends Level {

    public MainMenu(LevelManager levelManager) {
        super(levelManager);
    }

    @Override
    protected JPanel constructLevel() {

        JPanel panel = new JPanel();

        JLabel label = new JLabel();
        label.setText("Hello World!");

        JButton button = new JButton();

        button.setText("Next level");
        button.addActionListener((event) -> {
            levelManager.load("Level1");
        });

        panel.add(label);
        panel.add(button);

        return panel;
    }
}
