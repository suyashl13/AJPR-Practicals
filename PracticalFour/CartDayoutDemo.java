import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class CartDayoutDemo extends JFrame implements ActionListener{
    CardLayout card;
    Container c;
    JButton b1,b2,b3;
    
    CartDayoutDemo(){
        c = getContentPane();
        card = new CardLayout(40,30);
        c.setLayout(card);
        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Cat");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        CartDayoutDemo cartDayoutDemo = new CartDayoutDemo();
        cartDayoutDemo.setSize(200, 200);
        cartDayoutDemo.setVisible(true);
        cartDayoutDemo.setDefaultCloseOperation(3);
    }
}
