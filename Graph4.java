import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Graph4{

    public static void main(String[] args){  
        Function4 panel = new Function4();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}


