import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ddcjoshuad
 */
public class BounceFrame extends JFrame {
    private BallComponent component;
    public static  final int STEPS = 1000;
    public static final int DELAY = 3;

    public BounceFrame(){
        setTitle("Bounce");
        component = new BallComponent();
        add(component, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();

        addButton(buttonPanel, "Start", new ActionListener(){
            public void actionPerformed(ActionEvent event){
                addBall();
            }
        });

        addButton(buttonPanel, "Close", new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall(){
        try{
            Ball ball = new Ball();
            component.addBall(ball);
            for(int i=1; i<=STEPS; i++){
                ball.move(component.getBounds());
                component.paint(component.getGraphics());
                Thread.sleep(DELAY);
            }
        }catch (InterruptedException e){

        }
    }
}
