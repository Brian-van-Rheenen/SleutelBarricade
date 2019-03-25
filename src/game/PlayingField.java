package game;

import game.objects.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PlayingField extends JPanel{

    private int width;
    private int height;

    public PlayingField(List<GameObject> GameObjects) {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        for (GameObject object: GameObjects) {
            Position pos = object.getPosition();

            gbc.gridx = pos.getxPosition();
            gbc.gridy = pos.getyPosition();
            add(object,gbc);
        }

    }



}
