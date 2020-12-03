import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DropDownDemo implements ActionListener {
    JFrame frame;
    JComboBox comboBox;
    String [] items = {
        "Solapur",
        "Mumbai",
        "Pune",
        "Banglore"
    };
    JLabel label;

    DropDownDemo(){
        label = new JLabel("None!");
        frame = new JFrame("Frame");
        comboBox = new JComboBox<String>(items);
        comboBox.addActionListener(this);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);
        frame.add(label, "lbl");
    }

    public void actionPerformed(ActionEvent ae) {
        label.setText(""+comboBox.getSelectedItem());
    }

    public static void main(String[] args) {
        new DropDownDemo();
    }
}
