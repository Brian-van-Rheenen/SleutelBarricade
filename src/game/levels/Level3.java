package game.levels;

import game.*;
import game.components.SideMenu;
import game.objects.*;

import javax.swing.*;
import java.awt.*;

public class Level3 extends Level {

    /**
     * Level 3  of the game
     * @param levelManager manages the level
     * @param game contains the level
     */
    public Level3(LevelManager levelManager, Game game) {
        super(levelManager, game);
    }

    /**
     * Construct the level
     * @return a JPanel containing a fully constructed level
     */
    @Override
    @SuppressWarnings("Duplicates")
    public JPanel constructLevel() {

        // Level container panel
        JPanel levelContainer =  new JPanel(new GridBagLayout());

        PlayingField field = new PlayingField(this);

        // Create player and register for keyboard input with the KeyListener
        Player player = new Player(new Position(5,4), field);

        game.AttachKeyListener(player);
        add(player);

        gameObjects.add(player);

        // Create and add the goal
        gameObjects.add(new Goal(new Position(5,2), () -> levelManager.load(Level1.class)));

        // Create and add the different walls
        gameObjects.add(new Wall(new Position(0,7)));
        gameObjects.add(new Wall(new Position(0,8)));
        gameObjects.add(new Wall(new Position(0,9)));
        gameObjects.add(new Wall(new Position(1,1)));
        gameObjects.add(new Wall(new Position(1,2)));
        gameObjects.add(new Wall(new Position(1,3)));
        gameObjects.add(new Wall(new Position(1,5)));
        gameObjects.add(new Wall(new Position(2,3)));
        gameObjects.add(new Wall(new Position(2,4)));
        gameObjects.add(new Wall(new Position(2,5)));
        gameObjects.add(new Wall(new Position(2,6)));
        gameObjects.add(new Wall(new Position(2,8)));
        gameObjects.add(new Wall(new Position(3,8)));
        gameObjects.add(new Wall(new Position(3,9)));
        gameObjects.add(new Wall(new Position(4,1)));
        gameObjects.add(new Wall(new Position(4,2)));
        gameObjects.add(new Wall(new Position(4,3)));
        gameObjects.add(new Wall(new Position(4,5)));
        gameObjects.add(new Wall(new Position(4,6)));
        gameObjects.add(new Wall(new Position(5,1)));
        gameObjects.add(new Wall(new Position(5,3)));
        gameObjects.add(new Wall(new Position(5,5)));
        gameObjects.add(new Wall(new Position(5,8)));
        gameObjects.add(new Wall(new Position(6,1)));
        gameObjects.add(new Wall(new Position(6,3)));
        gameObjects.add(new Wall(new Position(6,5)));
        gameObjects.add(new Wall(new Position(6,6)));
        gameObjects.add(new Wall(new Position(6,7)));
        gameObjects.add(new Wall(new Position(6,8)));
        gameObjects.add(new Wall(new Position(6,9)));
        gameObjects.add(new Wall(new Position(7,3)));
        gameObjects.add(new Wall(new Position(7,7)));
        gameObjects.add(new Wall(new Position(8,0)));
        gameObjects.add(new Wall(new Position(8,2)));
        gameObjects.add(new Wall(new Position(8,3)));
        gameObjects.add(new Wall(new Position(8,9)));
        gameObjects.add(new Wall(new Position(9,3)));
        gameObjects.add(new Wall(new Position(9,4)));
        gameObjects.add(new Wall(new Position(9,5)));
        gameObjects.add(new Wall(new Position(9,6)));
        gameObjects.add(new Wall(new Position(9,7)));
        gameObjects.add(new Wall(new Position(9,8)));
        gameObjects.add(new Wall(new Position(9,9)));

        // Create and add the different barricades
        gameObjects.add(new Barricade(new Position(0,5), 100));
        gameObjects.add(new Barricade(new Position(1,9), 900));
        gameObjects.add(new Barricade(new Position(2,0), 400));
        gameObjects.add(new Barricade(new Position(2,2), 500));
        gameObjects.add(new Barricade(new Position(3,0), 600));
        gameObjects.add(new Barricade(new Position(3,1), 200));
        gameObjects.add(new Barricade(new Position(3,2), 100));
        gameObjects.add(new Barricade(new Position(4,8), 100));
        gameObjects.add(new Barricade(new Position(4,9), 500));
        gameObjects.add(new Barricade(new Position(6,2), 400));
        gameObjects.add(new Barricade(new Position(6,4), 300));
        gameObjects.add(new Barricade(new Position(7,0), 600));
        gameObjects.add(new Barricade(new Position(7,1), 600));
        gameObjects.add(new Barricade(new Position(7,2), 800));
        gameObjects.add(new Barricade(new Position(8,1), 600));
        gameObjects.add(new Barricade(new Position(8,6), 300));
        gameObjects.add(new Barricade(new Position(8,7), 300));
        gameObjects.add(new Barricade(new Position(8,8), 300));
        gameObjects.add(new Barricade(new Position(9,1), 600));

        // Create and add the different keys
        gameObjects.add(new Key(new Position(1,4), 900));
        gameObjects.add(new Key(new Position(2,1), 300));
        gameObjects.add(new Key(new Position(2,9), 400));
        gameObjects.add(new Key(new Position(5,6), 100));
        gameObjects.add(new Key(new Position(5,9), 600));
        gameObjects.add(new Key(new Position(7,9), 500));
        gameObjects.add(new Key(new Position(9,0), 800));
        gameObjects.add(new Key(new Position(9,2), 400));

        GridBagConstraints levelConstraints = new GridBagConstraints();
        levelConstraints.fill = GridBagConstraints.BOTH;
        levelConstraints.anchor = GridBagConstraints.CENTER;
        levelConstraints.gridx = 0;
        levelConstraints.gridy = 0;
        levelConstraints.weightx = 1;
        levelConstraints.weighty = 1;

        levelContainer.add(field, levelConstraints);

        levelConstraints.fill = GridBagConstraints.BOTH;
        levelConstraints.anchor = GridBagConstraints.EAST;
        levelConstraints.gridx = 1;
        levelConstraints.gridy = 0;
        levelConstraints.weightx = 0.33;
        levelConstraints.weighty = 1;
        levelConstraints.insets = new Insets(25, 0, 0, 0);

        SideMenu sideMenu = new SideMenu(levelManager, this.getClass(), game);

        levelContainer.add(sideMenu, levelConstraints);

        return levelContainer;
    }
}
