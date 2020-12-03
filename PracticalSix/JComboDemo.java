import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JComboDemo implements ActionListener {
    JFrame frame;
    JComboBox combobox;
    JLabel label;
    JComboDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        String states [] = {
            "Maharashtra",
            "Uttar Pradesh",
            "Andra Pradesh",
            "Mizoram",
            "Gujarat"
        };

        combobox = new JComboBox<String>(states);

        combobox.addActionListener(this);
        frame.add(combobox);
        label = new JLabel("State");
        frame.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I am called");
        label.setText(combobox.getSelectedItem().toString());
    }

    public static void main(String[] args) {
        new JComboDemo();
    }
}
