package game;

import javax.swing.*;

public class Game {
    private JFrame window = new JFrame();
    private LevelManager manager;

    /**
     * Create a new game window and attempt to load the specified level
     * @param startLevel The identifier of the level to load
     */
    public Game(String startLevel) {
        window.setSize(1080, 720);
        window.setTitle("Sleutel Barricade");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Create the LevelManager and give it a reference to the window so it can update the levels
        manager = new LevelManager(this);

        // Load the first level
        manager.load(startLevel);
    }

    /**
     * Redraw the Game Window
     * @param level the level to draw to the game screen
     */
    public void loadLevel(JPanel level) {
        window.setContentPane(level);
        window.revalidate();
        window.repaint();
    }

    /**
     * Quit the application.
     * TODO rename end() naar quit in Design diagram
     */
    public void quit() {
        System.exit(0);
    }

}
