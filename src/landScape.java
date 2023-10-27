import javax.swing.*;
import java.awt.*;

// 0,0 is the top left l
// AS Y VALUE GETS BIGGER, GOES DOWN, NEGATIVE OF MATH CLASS
public class landScape extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("landScape");
        frame.getContentPane().add(new landScape());
        frame.setBounds(0, 0, 900, 600); // top left corner is 0,0
        // width is 1000
        // height is 800
        frame.setResizable(false);
        frame.setVisible(true);
    }


    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(0, 0, 900, 400);  // draw could be used for outlining, this fills the rectangle at the coordinates.
        g.setColor(Color.green);
        g.fillRect(0,400,900,200);
        g.setColor(Color.yellow);
        g.fillOval(25,25,100,100);
    }



}