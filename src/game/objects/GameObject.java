package game.objects;

import game.Position;
import javax.swing.*;
import java.net.URL;


public abstract class GameObject extends JPanel {

    private int value;
    private Position position;
    private URL url;

    /**
     * An object in the game
     * @param position containing X and Y coordinates
     */
    public GameObject(Position position) {
        super();
        this.position = position;
    }

    /**
     * Get the value (where appropriate)
     * @return the value of the object
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Set the value of the object (where appropriate)
     * @param value containing the new value of the object (where appropriate)
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Get the position of the object
     * @return the position of the object
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Set the position of the object
     * @param position containing the new coordinates of the object
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Set the object's image
     * @param imagePath the path of where the image is stored
     */
    public void setImage(URL imagePath){
        url = imagePath;
    }

    /**
     * Get the URL of the image path of where the image is stored
     * @return the URL of the image path
     */
    public URL getUrl() {
        return url;
    }
}
