package game.objects;

import game.Position;

public class Goal extends GameObject{

    public Goal(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/goal.png"));
    }

    // TODO: Write finish method that checks if the player has reached the goal. If so, the level is finished.
    public boolean finish(){
        return false;
    }
}
