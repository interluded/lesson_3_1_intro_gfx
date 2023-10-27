import javax.swing.*;
import java.awt.*;

// 0,0 is the top left
// AS Y VALUE GETS BIGGER, GOES DOWN, NEGATIVE OF MATH CLASS
public class hollandFlag extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hollandFlag");
        frame.getContentPane().add(new hollandFlag());
        frame.setBounds(0, 0, 900, 600); // top left corner is 0,0
        // width is 1000
        // height is 800
        frame.setResizable(false);
        frame.setVisible(true);
    }


    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(0, 0, 900, 200);  // draw could be used for outlining, this fills the rectangle at the coordiantes.
        g.setColor(Color.blue);
        g.fillRect(0, 400, 900, 200);
    }

}