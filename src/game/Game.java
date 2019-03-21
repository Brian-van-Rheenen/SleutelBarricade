package game;

import javax.swing.*;

public class Game {
    private JFrame window = new JFrame();

    public Game() {
        this.window.setSize(1080, 720);
        this.window.setTitle("Sleutel Barricade");
        this.window.setVisible(true);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Quit the application.
     * TODO rename end() naar quit in Design diagram
     */
    public void quit() {
        System.exit(0);
    }

}
