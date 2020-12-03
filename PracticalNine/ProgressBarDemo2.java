import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ProgressBarDemo2 implements ActionListener {

    JProgressBar progressBar;
    JButton button;
    JFrame frame;

    ProgressBarDemo2(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        progressBar = new JProgressBar(1,10);
        progressBar.setValue(9);
        
        button = new JButton("Show Progress");
        button.addActionListener(this);

        frame.add(progressBar);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        progressBar.setStringPainted(true);
    }

    public static void main(String[] args) {
        new ProgressBarDemo2();
    }
}
