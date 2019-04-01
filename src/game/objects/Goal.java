package game.objects;

import game.Position;

public class Goal extends GameObject{

    public Goal(Position position) {
        super(position);
        setImage(this.getClass().getResource("/resources/sprites/goal.png"));
    }



}
