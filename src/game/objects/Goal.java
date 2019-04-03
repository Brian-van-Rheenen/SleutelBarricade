package game.objects;

import game.Position;

public class Goal extends GameObject {

    private Runnable goalHit;

    public Goal(Position position, Runnable onGoalHit) {
        super(position);

        this.goalHit = onGoalHit;

        setImage(this.getClass().getResource("/resources/sprites/goal.png"));
    }

    public Runnable getGoalHit() {
        return goalHit;
    }
}
