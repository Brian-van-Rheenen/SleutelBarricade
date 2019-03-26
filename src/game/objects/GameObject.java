package game.objects;

import game.Position;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;


public abstract class GameObject extends JPanel {

    private Position position;
    private URL url;
    private ImageIcon imageIcon;
    private JLabel label;

    public GameObject(Position position) {
        super();
        this.position = position;
//        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Position getPosition() {
        return position;
    }

    public void setImage(URL imagePath){
        imageIcon = new ImageIcon(imagePath);
        label = new JLabel(imageIcon);
        add(label);

    }

    // This portion of code was copied from a StackOverflow answer. This answer can be found via the following link:
    // https://stackoverflow.com/questions/16075022/making-a-jpanel-square
    @Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        Container c = getParent();
        if (c != null) {
            d = c.getSize();
        } else {
            return new Dimension(10, 10);
        }
        int w = (int) d.getWidth();
        int h = (int) d.getHeight();
        int s = (w < h ? w : h);
        return new Dimension(s, s);
    }

}
