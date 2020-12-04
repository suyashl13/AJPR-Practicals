import java.awt.*;
import java.awt.event.*;

public class WindowDemo {
    Frame f;
    WindowDemo() {
        f = new Frame("Frame Demo");
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                f.dispose();
            }
        });
        f.setSize(200, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowDemo();
    }    
}
