package game;

import game.levels.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

/**
 * The Main window of the game
 */
public class Game {
    private JFrame window = new JFrame();
    private LevelManager manager;

    /**
     * Create a new game window and attempt to load the specified level
     * @param startLevel The level to start the game with
     */
    public Game(Class<? extends Level> startLevel) {
        window.setSize(1080, 720);
        window.setMinimumSize(new Dimension(1080, 710));
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
        window.requestFocusInWindow();
    }

    /**
     * Register a KeyListener for receiving KeyEvents
     * @param listener the listener to attach to the main game window
     */
    public void AttachKeyListener(KeyListener listener) {
        window.addKeyListener(listener);
    }

    /**
     * Return to the main menu.
     */
    public void exit() {
        manager.load(MainMenu.class);
    }

    /**
     * Quit the application
     */
    public void quit() { System.exit(0); }
}
