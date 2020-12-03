import java.awt.*;
import javax.swing.*;

public class MenuDemo {
    JFrame frame;
    
    MenuDemo(){
        frame = new JFrame();
        JMenuBar menu;
        JMenu red, green,blue ,black;
        frame.setSize(200, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        menu = new JMenuBar();
        red = new JMenu("Red");
        green = new JMenu("Green");
        blue = new JMenu("Blue");
        black = new JMenu("Black");
        black.setEnabled(false);;

        menu.add(red);
        menu.add(green);
        menu.add(blue);
        menu.add(black);

        frame.add(menu);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
}
