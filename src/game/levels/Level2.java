package game.levels;

import game.*;
import game.components.SideMenu;
import game.objects.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Level2 extends Level {

    /**
     * Level 2 of the game
     * @param levelManager manages the level
     * @param game contains the level
     */
    public Level2(LevelManager levelManager, Game game) {
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
        Player player = new Player(new Position(4,2), field);

        game.AttachKeyListener(player);
        add(player);

        gameObjects.add(player);

        // Create and add the goal
        gameObjects.add(new Goal(new Position(0,0), () -> levelManager.load(Level1.class)));

        // Create and add the different walls
        gameObjects.add(new Wall(new Position(1,0)));
        gameObjects.add(new Wall(new Position(1,1)));
        gameObjects.add(new Wall(new Position(1,2)));
        gameObjects.add(new Wall(new Position(1,3)));
        gameObjects.add(new Wall(new Position(1,4)));
        gameObjects.add(new Wall(new Position(1,5)));
        gameObjects.add(new Wall(new Position(1,6)));
        gameObjects.add(new Wall(new Position(1,7)));
        gameObjects.add(new Wall(new Position(1,8)));
        gameObjects.add(new Wall(new Position(2,3)));
        gameObjects.add(new Wall(new Position(2,8)));
        gameObjects.add(new Wall(new Position(3,1)));
        gameObjects.add(new Wall(new Position(3,3)));
        gameObjects.add(new Wall(new Position(3,5)));
        gameObjects.add(new Wall(new Position(3,6)));
        gameObjects.add(new Wall(new Position(3,8)));
        gameObjects.add(new Wall(new Position(4,1)));
        gameObjects.add(new Wall(new Position(4,3)));
        gameObjects.add(new Wall(new Position(4,5)));
        gameObjects.add(new Wall(new Position(4,8)));
        gameObjects.add(new Wall(new Position(5,1)));
        gameObjects.add(new Wall(new Position(5,2)));
        gameObjects.add(new Wall(new Position(5,3)));
        gameObjects.add(new Wall(new Position(5,5)));
        gameObjects.add(new Wall(new Position(5,6)));
        gameObjects.add(new Wall(new Position(5,7)));
        gameObjects.add(new Wall(new Position(5,8)));
        gameObjects.add(new Wall(new Position(7,0)));
        gameObjects.add(new Wall(new Position(7,1)));
        gameObjects.add(new Wall(new Position(7,2)));
        gameObjects.add(new Wall(new Position(7,3)));
        gameObjects.add(new Wall(new Position(7,4)));
        gameObjects.add(new Wall(new Position(7,5)));
        gameObjects.add(new Wall(new Position(7,7)));
        gameObjects.add(new Wall(new Position(7,9)));
        gameObjects.add(new Wall(new Position(8,5)));
        gameObjects.add(new Wall(new Position(8,7)));
        gameObjects.add(new Wall(new Position(9,1)));
        gameObjects.add(new Wall(new Position(9,2)));
        gameObjects.add(new Wall(new Position(9,3)));
        gameObjects.add(new Wall(new Position(9,7)));
        gameObjects.add(new Wall(new Position(9,8)));

        // Create and add the different barricades
        gameObjects.add(new Barricade(new Position(0,4), 600));
        gameObjects.add(new Barricade(new Position(0,5), 500));
        gameObjects.add(new Barricade(new Position(0,6), 400));
        gameObjects.add(new Barricade(new Position(0,7), 300));
        gameObjects.add(new Barricade(new Position(0,8), 200));
        gameObjects.add(new Barricade(new Position(2,5), 200));
        gameObjects.add(new Barricade(new Position(3,9), 100));
        gameObjects.add(new Barricade(new Position(5,4), 100));
        gameObjects.add(new Barricade(new Position(7,6), 400));
        gameObjects.add(new Barricade(new Position(7,8), 300));
        gameObjects.add(new Barricade(new Position(8,2), 500));

        // Create and add the different keys
        gameObjects.add(new Key(new Position(0,9), 200));
        gameObjects.add(new Key(new Position(4,6), 300));
        gameObjects.add(new Key(new Position(6,1), 100));
        gameObjects.add(new Key(new Position(8,6), 500));
        gameObjects.add(new Key(new Position(9,0), 600));
        gameObjects.add(new Key(new Position(9,9), 400));

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

        setPanelBackgrounds(levelContainer, new Color(206, 206, 206));

        return levelContainer;
    }
}
