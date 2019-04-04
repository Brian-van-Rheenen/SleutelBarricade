/**
 * Contains Font management classes.
 */
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

        // Initialize the fonts
        initialize8BitWonders();
        initializeVCR_OSD_Mono();
    }

    /**
     * Initialize the 8-bit-wonders font.
     */
    public void initialize8BitWonders() {
        try {
            this.ge.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/resources/fonts/8-bit-wonder.ttf")));
        } catch (IOException |FontFormatException e) { }
    }

    /**
     * Initialize the VCR OSD Mono font.
     */
    public void initializeVCR_OSD_Mono() {
        try {
            this.ge.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/resources/fonts/vcr_osd_mono.ttf")));
        } catch (IOException |FontFormatException e) { }
    }

    /**
     * Prints all available font family names - for testing purposes only.
     */
    public void printAllFonts() {
        String fonts[] = this.ge.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for ( int i = 0; i < fonts.length; i++ )
        {
            System.out.println(fonts[i]);
        }
    }
}
