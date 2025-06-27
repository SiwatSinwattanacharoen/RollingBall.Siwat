package Lib;
import java.awt.*;
import javax.swing.*;

public class RollingBall extends JPanel {
    int x = 100;
    int y = 90;
    int start_angle = 0;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,80,80);
        g.fillArc(x,y,80,80,start_angle,180);
    }

}
