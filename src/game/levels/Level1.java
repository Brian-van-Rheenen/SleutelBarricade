package game.levels;

import game.Level;
import game.LevelManager;
import game.PlayingField;
import game.Position;
import game.objects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class Level1 extends Level {

    public Level1(LevelManager levelManager) {
        super(levelManager);
    }

    @Override
    protected JPanel constructLevel() {

        // TODO: Write method constructLevel in such a way that it contains a complete level

        List<GameObject> gameObjects = new ArrayList<>();
        gameObjects.add(new Player(new Position(0,0)));

        gameObjects.add(new Goal(new Position(9,9)));

        gameObjects.add(new Key(new Position(0,8), 200));
        gameObjects.add(new Key(new Position(4,1), 100));
        gameObjects.add(new Key(new Position(5,1), 300));
        gameObjects.add(new Key(new Position(9,2), 100));

        gameObjects.add(new Wall(new Position(1,0)));
        gameObjects.add(new Wall(new Position(1,3)));
        gameObjects.add(new Wall(new Position(1,4)));
        gameObjects.add(new Wall(new Position(1,6)));
        gameObjects.add(new Wall(new Position(1,7)));
        gameObjects.add(new Wall(new Position(1,8)));
        gameObjects.add(new Wall(new Position(1,9)));
        gameObjects.add(new Wall(new Position(3,6)));
        gameObjects.add(new Wall(new Position(4,4)));
        gameObjects.add(new Wall(new Position(4,6)));
        gameObjects.add(new Wall(new Position(5,4)));
        gameObjects.add(new Wall(new Position(6,4)));
        gameObjects.add(new Wall(new Position(6,5)));
        gameObjects.add(new Wall(new Position(6,6)));
        gameObjects.add(new Wall(new Position(7,6)));
        gameObjects.add(new Wall(new Position(7,8)));
        gameObjects.add(new Wall(new Position(7,9)));


        gameObjects.add(new Barricade(new Position(1,5), 200));
        gameObjects.add(new Barricade(new Position(1,5), 200));
        gameObjects.add(new Barricade(new Position(2,0), 100));
        gameObjects.add(new Barricade(new Position(2,2), 100));
        gameObjects.add(new Barricade(new Position(2,3), 100));
        gameObjects.add(new Barricade(new Position(2,4), 100));
        gameObjects.add(new Barricade(new Position(2,5), 100));
        gameObjects.add(new Barricade(new Position(2,6), 100));
        gameObjects.add(new Barricade(new Position(2,7), 100));
        gameObjects.add(new Barricade(new Position(2,8), 100));
        gameObjects.add(new Barricade(new Position(2,9), 100));
        gameObjects.add(new Barricade(new Position(3,4), 100));
        gameObjects.add(new Barricade(new Position(3,7), 900));
        gameObjects.add(new Barricade(new Position(3,8), 50));
        gameObjects.add(new Barricade(new Position(3,9), 150));
        gameObjects.add(new Barricade(new Position(4,7), 500));
        gameObjects.add(new Barricade(new Position(5,6), 300));
        gameObjects.add(new Barricade(new Position(5,7), 100));
        gameObjects.add(new Barricade(new Position(7,0), 30));
        gameObjects.add(new Barricade(new Position(7,1), 90));
        gameObjects.add(new Barricade(new Position(7,2), 300));
        gameObjects.add(new Barricade(new Position(7,3), 190));
        gameObjects.add(new Barricade(new Position(7,4), 220));
        gameObjects.add(new Barricade(new Position(7,5), 100));
        gameObjects.add(new Barricade(new Position(8,0), 70));
        gameObjects.add(new Barricade(new Position(8,1), 40));
        gameObjects.add(new Barricade(new Position(8,2), 300));
        gameObjects.add(new Barricade(new Position(8,3), 80));
        gameObjects.add(new Barricade(new Position(8,4), 100));
        gameObjects.add(new Barricade(new Position(8,5), 360));
        gameObjects.add(new Barricade(new Position(9,0), 90));
        gameObjects.add(new Barricade(new Position(9,1), 90));
        gameObjects.add(new Barricade(new Position(9,3), 90));
        gameObjects.add(new Barricade(new Position(9,4), 50));

        JPanel panel = new PlayingField(gameObjects);

        return panel;
    }
}
