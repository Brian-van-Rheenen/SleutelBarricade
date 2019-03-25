package game;

import javax.swing.*;

public abstract class Level extends JPanel {
    private Position startPosition;
    private Position endPosition;
    protected LevelManager levelManager;
    private JPanel panel;

    public Level(LevelManager levelManager) {
        this.levelManager = levelManager;
        panel = constructLevel();
    }

    /**
     * Construct the level
     * @return A JPanel with a fully constructed level
     */
    protected abstract JPanel constructLevel();

    public JPanel getPanel() {
        return panel;
    }

    public Position getStartPosition() {
        return this.startPosition;
    }

    public Position getEndPosition() {
        return this.endPosition;
    }


}
