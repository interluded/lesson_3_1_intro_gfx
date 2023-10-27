import javax.swing.*;
import java.awt.*;

// 0,0 is the top left
// AS Y VALUE GETS BIGGER, GOES DOWN, NEGATIVE OF MATH CLASS
public class italianFlag extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Italian Flag");
        frame.getContentPane().add(new italianFlag());
        frame.setBounds(0, 0, 900, 600); // top left corner is 0,0
        // width is 1000
        // height is 800
        frame.setResizable(false);
        frame.setVisible(true);
    }


    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(600, 0, 300, 600);  // draw could be used for outlining, this fills the rectangle at the coordiantes.
        g.setColor(new Color(0, 140, 69));
        g.fillRect(0, 0, 300, 600);
    }

}