import javax.swing.*;

/**
 * @author ddcjoshuad
 */
public class BallRunnable implements Runnable {
    private Ball ball;
    private BallComponent component;

    public BallRunnable(Ball ball, JPanel panel){
        this.ball = ball;
        this.component = panel;
    }

    @Override
    public void run() {
        try{
            for(int i=1; i<= STEPS; i++){
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e){

        }
    }
}
