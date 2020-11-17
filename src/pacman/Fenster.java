package pacman;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenster extends JFrame
{

    public Fenster() 
    {
        this.add(new Grafik());
        this.setTitle("PacMan");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(760,865);
        this.setIconImage(new ImageIcon("Icon.png").getImage());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new Fenster();
    }
    
}
