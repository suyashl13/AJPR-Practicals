import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo {
    JFrame frame;
    JScrollPane scrollPane;

    ScrollPaneDemo(){
        frame = new JFrame("Scroll Pane");

        scrollPane = new JScrollPane();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(3);
        frame.setSize(200,300);
        frame.setVisible(true);
        frame.add(new JButton("Lorem Ipsum"));

    }
  
    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}
