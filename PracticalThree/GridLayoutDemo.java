import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {

    GridLayoutDemo(){
        Container container = new JFrame("Hello");
        container.setLayout(new GridLayout(2,2,2,2));
        container.setSize(200,200);
        container.setVisible(true);
        
        container.add(new JButton("1"));
        container.add(new JButton("2"));
        container.add(new JButton("3"));
        container.add(new JButton("4"));
        container.add(new JButton("5"));
        container.add(new JButton("6"));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                new GridLayoutDemo();
            }
        });
    }
}