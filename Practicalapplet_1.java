
/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
/*Practical No :-1 */
/* Write a Program to demonstrate the use of JLabel and ImageIcon, JTextField
    and JPasswordField. 
*/

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;

public class Practicalapplet_1 extends Applet {
  public void init() {
    
    ImageIcon icon = new ImageIcon("icon.png");
    System.out.println("Icon height is " + icon.getIconHeight());
    // Create the Label
    JLabel label = new JLabel("", icon, JLabel.CENTER);
    // Set the size of frame
    label.setBounds(20, 20, 200, 200);

    // Create the TextField to enter the text
    JTextField text = new JTextField("Username", 15);
    text.setBounds(190, 105, 150, 35);

    // Create the Label for Password
    JLabel passlabel = new JLabel("Password", JLabel.CENTER);
    passlabel.setBounds(20, 90, 200, 200);

    JPasswordField password = new JPasswordField("Password");
    password.setBounds(190, 170, 150, 35);

    JButton b = new JButton("Login");
    b.setBounds(160, 230, 120, 30);

    // Add label to frame
    add(label);
    add(text);
    add(passlabel);
    add(password);
    add(b);

  }
}

/*
 * <html> <head> <title>Login</title> </head> <body> <h3>Login</h3> <applet
 * code="Practicalapplet_1.class" width="450" height="430"
 * alt="Error loading applet!"> </applet> </body> </html>
 */
