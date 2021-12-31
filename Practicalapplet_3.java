


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
import java.applet.*;

public class Practicalapplet_3 extends Applet {
    public void init() {
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
        add(tree);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
    }

}
/*
 * <html> <head> <title>Login</title> </head> <body> <h3>Login</h3> <applet
 * code="Practicalapplet_3.class" width="450" height="430"
 * alt="Error loading applet!"> </applet> </body> </html>
 */
