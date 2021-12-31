
/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                /*Practical No :-3 */
/* Write a Program in java to create a JTree
*/

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Practical_3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tree");
        // Create top node of tree.
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        // Create subtree of "A".
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);
        // Create subtree of "B".
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        JTree tree = new JTree(top);
        tree.setBounds(250, 20, 100, 400);
        frame.add(tree);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
