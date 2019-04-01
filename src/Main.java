import game.Game;
import game.fonts.Font;
import game.levels.MainMenu;

public class Main {

    public static void main(String[] args) {
        Font font = new Font();

        Game game = new Game(MainMenu.class);
    }
}
