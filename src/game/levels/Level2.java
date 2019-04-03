package game.levels;

import game.*;
import game.levels.panels.SideMenu;
import game.objects.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Level2 extends Level {

    public Level2(LevelManager levelManager, Game game) {
        super(levelManager, game);
    }

    @Override
    @SuppressWarnings("Duplicates")
    public JPanel constructLevel() {

        // Level container panel
        JPanel levelContainer =  new JPanel(new GridBagLayout());

        // TODO: Write method constructLevel in such a way that it contains a complete level
        PlayingField field = new PlayingField(this);

        // Create player and register for keyboard input with the KeyListener
        Player player = new Player(new Position(4,2), field);

        game.AttachKeyListener(player);
        add(player);

        gameObjects.add(player);

        gameObjects.add(new Goal(new Position(0,0), () -> {}));

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

        gameObjects.add(new Key(new Position(0,9), 200));
        gameObjects.add(new Key(new Position(4,6), 300));
        gameObjects.add(new Key(new Position(6,1), 100));
        gameObjects.add(new Key(new Position(8,6), 500));
        gameObjects.add(new Key(new Position(9,0), 600));
        gameObjects.add(new Key(new Position(9,9), 400));

        JPanel sideMenuPanel = new JPanel();

        JButton sideMenuButton = new JButton("Restart");
        sideMenuButton.setPreferredSize(new Dimension(220, 50));
        sideMenuButton.setBackground(new Color(244, 194, 66));
        sideMenuButton.setFont(new Font("8BIT WONDER", Font.PLAIN, 28));
        sideMenuButton.setForeground(Color.WHITE);
        sideMenuButton.setBorder(new LineBorder(new Color(122, 122, 122)));
        sideMenuButton.setFocusPainted(false);
        sideMenuButton.addActionListener((e) -> {
            levelManager.load(this.getClass());
        });

        sideMenuPanel.add(sideMenuButton);

        JPanel sideMenuContainer = new JPanel();
        sideMenuContainer.add(sideMenuPanel);

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

        SideMenu sideMenu = new SideMenu(levelManager, this.getClass());

        levelContainer.add(sideMenu, levelConstraints);

        return levelContainer;
    }
}
