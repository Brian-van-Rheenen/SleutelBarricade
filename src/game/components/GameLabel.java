package game.components;

import javax.swing.*;
import java.awt.*;

/**
 * A custom styled JLabel to be used for consistent styling of JLables across the game.
 */
public class GameLabel extends JLabel {

    /**
     * Create a JLabel.
     * @param text the text to display on the JLabel.
     */
    public GameLabel(String text) {
        super(text);

        setFont(new Font("8BIT WONDER", Font.PLAIN, 16));
    }
}
