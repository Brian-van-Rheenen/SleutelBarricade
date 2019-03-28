package game.fonts;

import java.awt.*;
import java.io.IOException;

/**
 * Font class that initialize custom imported fonts.
 */
public class Font {
    private GraphicsEnvironment ge;

    /**
     * Initialize all custom fonts.
     */
    public Font() {
        this.ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Initialize the font
        initialize8BitWonders();
    }

    /**
     * Initialize the 8-bit-wonders font.
     */
    public void initialize8BitWonders() {
        try {
            this.ge.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/resources/fonts/8-bit-wonder.ttf")));
        } catch (IOException |FontFormatException e) { }
    }
}
