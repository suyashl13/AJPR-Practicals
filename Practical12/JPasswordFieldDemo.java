import javax.swing.*;
import java.awt.*;

public class JPasswordFieldDemo{
    
    JFrame frame;
    JPasswordField passwordField;

    JPasswordFieldDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        passwordField = new JPasswordField("", 12);
        passwordField.setEchoChar('#');
        frame.add(passwordField);
        frame.add(new JButton("OK"));
    }

    public static void main(String [] args) {
        new JPasswordFieldDemo();
    }
}
