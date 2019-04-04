package game.components;

import javax.swing.*;
import java.awt.*;

public class GameLabel extends JLabel {

    /**
     * Create a button with only text
     * @param text the text to display on the button
     */
    public GameLabel(String text) {
        super(text);

        setFont(new Font("8BIT WONDER", Font.PLAIN, 16));
    }
}
