import javax.swing.*;
import java.awt.*;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * @author ddcjoshuad
 */
public class BallComponent extends JPanel {
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 350;

    private List<Ball> balls = newArrayList();

    public void addBall(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g); // erase background
        Graphics2D g2 = (Graphics2D) g;
        for(Ball b : balls){
            g2.fill(b.getShape());
        }
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
