import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame;
    ProgressBarDemo(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JProgressBar progressBar = new JProgressBar(1,10);
        progressBar.setValue(9);
        frame.add(progressBar);
    }
    public static void main(String[] args) {
        new ProgressBarDemo();
    }
}
