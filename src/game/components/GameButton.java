package game.components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * A custom styled button to be used for consistent styling of buttons across the game
 */
public class GameButton extends JButton {

    /**
     * Create a Custom Game button with a text and an ActionListener
     * @param text The text to display on the button
     * @param action The action to execute when the button is pressed
     */
    public GameButton(String text, ActionListener action) {
        // Call the constructor in the current class
        this(text);

        // Append the ActionListener after the button has been created
        addActionListener(action);
    }

    /**
     * Create a button with only text
     * @param text the text to display on the button
     */
    public GameButton(String text) {
        super(text);

        setPreferredSize(new Dimension(220, 50));
        setBackground(new Color(244, 194, 66));
        setFont(new Font("8BIT WONDER", Font.PLAIN, 28));
        setForeground(Color.WHITE);
        setBorder(new LineBorder(new Color(122, 122, 122)));
        setFocusPainted(false);
    }
}
