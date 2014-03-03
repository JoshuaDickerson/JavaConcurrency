import javax.swing.*;
import java.awt.*;

/**
 * @author ddcjoshuad
 */
public class Bounce {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
