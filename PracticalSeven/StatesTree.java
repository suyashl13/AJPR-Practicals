import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
import java.awt.*;

public class StatesTree {
    JFrame frame;
    StatesTree(){
        frame = new JFrame();
        DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode mumbai = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode pune = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode nashik = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode nagpur = new DefaultMutableTreeNode("Nagpur");
        DefaultMutableTreeNode Gujrath = new DefaultMutableTreeNode("Gujrath");

        india.add(maharashtra);
        india.add(Gujrath);

        maharashtra.add(mumbai);
        maharashtra.add(pune);
        maharashtra.add(nashik);
        maharashtra.add(nagpur);


        frame.add(new JTree(india));
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setSize(500,450);

    }

    public static void main(String[] args) {
        new StatesTree();
    }
}
