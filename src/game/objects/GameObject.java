package game.objects;

import game.Position;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;


public abstract class GameObject extends JPanel {

    private Position position;
    private URL url;

    public GameObject(Position position) {
        super();
        this.position = position;
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
