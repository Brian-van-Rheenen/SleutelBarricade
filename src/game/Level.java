package game;

public abstract class Level {
    private Position startPosition;
    private Position endPosition;
    protected LevelManager levelManager;

    public Level(LevelManager levelManager) {
        this.levelManager = levelManager;
    }

    public Position getStartPosition() {
        return this.startPosition;
    }

    public Position getEndPosition() {
        return this.endPosition;
    }
}
