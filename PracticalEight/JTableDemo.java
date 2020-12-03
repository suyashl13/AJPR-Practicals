import javax.swing.*;
import java.awt.*;


public class JTableDemo {
    JFrame frame;


    String [][] data = {
        {"101","Amit","670000"},
        {"102","Jai","700000"},
        {"103","Sachin","700000"},    
    };

    String [][] column = {
        {"ID","Name","Salary"},
    };

    JTableDemo() {
        frame = new JFrame("JTree Demo");
        frame.setDefaultCloseOperation(3);
        frame.setSize(200,200);
        frame.setVisible(true);

        JTable jt= new JTable(data,column);    
        jt.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(jt);    
        frame.add(sp);          
        frame.setSize(300,400);    
        frame.setVisible(true);    
        
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}
