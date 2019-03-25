package game.levels;

import game.Level;
import game.LevelManager;

import javax.swing.*;

public class Level1 extends Level {

    public Level1(LevelManager levelManager) {
        super(levelManager);
    }

    @Override
    protected JPanel constructLevel() {
        JPanel panel = new JPanel();

        JLabel label = new JLabel();
        label.setText("Hello World 2!");

        panel.add(label);

        return panel;
    }
}
