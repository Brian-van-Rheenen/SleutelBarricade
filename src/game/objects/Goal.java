package game.objects;

import game.Position;

public class Goal extends GameObject {

    private Runnable goalHit;

    /**
     * A goal which can end the game if the player reaches it
     * @param position the Position of the goal
     * @param onGoalHit an action that is performed when the goal is reached
     */
    public Goal(Position position, Runnable onGoalHit) {
        super(position);

        this.goalHit = onGoalHit;

        setImage(this.getClass().getResource("/resources/sprites/goal.png"));
    }

    /**
     * Get this if the goal has been reached
     * @return the action that needs to be performed
     */
    public Runnable getGoalHit() {
        return goalHit;
    }
}
