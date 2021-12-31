
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
import javax.swing.*;

class Practical_1 {
    public static void main(String[] args) {

        // Create Frame to put the components
        JFrame frame = new JFrame("Log in");
        // Terminate the program when the user closes the application.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create the Icon in the Label
        ImageIcon icon = new ImageIcon("icon.png");
        System.out.println("Icon height is " + icon.getIconHeight());
        // Create the Label
        JLabel label = new JLabel("", icon, JLabel.CENTER);
        // Set the color of the Label
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

        frame.setSize(430, 450);
        // Add label to frame
        frame.add(label);
        frame.add(text);
        frame.add(passlabel);
        frame.add(password);
        frame.add(b);
        frame.setLayout(null);
        // Make the frame Visible
        frame.setVisible(true);

    }
}
