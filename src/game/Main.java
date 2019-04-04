/**
 * The main Game package, This package contains the Main and all other classes
 */
package game;

import game.Game;
import game.fonts.Font;
import game.levels.MainMenu;

/**
 * This is the game.Main entrypoint of the program
 *
 * The most important classes in this program are:<br>
 *
 * - PlayingField<br>
 *     Contains Rendering of the game level to the screen, with resizability<br>
 *
 * - LevelManager<br>
 *     Allows for usage of multiple levels in the game<br>
 *
 * - GameObject<br>
 *     The base class for all GameObjects used in the game
 *     (eg. Player, Barricade, Key)
 *
 * @version 1.0.0
 * @author Sam Bitter, Brian van Rheenen, Lucas Spits
 */
public class Main {

    /**
     * The main entrypoint to the game, loads fonts and starts the Game
     * @param args arguments will be ignored for this program
     */
    public static void main(String[] args) {
        // Load all required fonts
        Font font = new Font();

        // Start the game!
        Game game = new Game(MainMenu.class);
    }
}
