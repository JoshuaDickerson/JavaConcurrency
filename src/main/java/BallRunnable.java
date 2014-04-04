import javax.swing.*;

/**
 * @author ddcjoshuad
 */
public class BallRunnable implements Runnable {
    private Ball ball;
    private BallComponent component;

    public BallRunnable(Ball ball, JPanel panel){
        this.ball = ball;
    }

    @Override
    public void run() {
    }
}
