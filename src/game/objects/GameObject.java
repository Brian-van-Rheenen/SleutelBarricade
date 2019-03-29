package game.objects;

import game.Position;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;


public abstract class GameObject extends JPanel {

    private int value;
    private Position position;
    private URL url;

    public GameObject(Position position) {
        super();
        this.position = position;
//        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Position getPosition() {
        return position;
    }

    public void setImage(URL imagePath){
        url = imagePath;
    }

    public URL getUrl() {
        return url;
    }
}
