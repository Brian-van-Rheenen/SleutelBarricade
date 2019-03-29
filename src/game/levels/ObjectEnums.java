package game.levels;

public enum LevelParser {

    P("Player"),
    W("Wall"),
    B("Barricade"),
    K("Key"),
    G("Goal"),
    E("Empty");

    private String shortcut;

    LevelParser(String shortcut) {
        this.shortcut = shortcut;
    }
}
