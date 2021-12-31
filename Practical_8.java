//Write a Program to demonstrate the function of JLabel, JTextField and JPasswordField Using Listener Interface.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical_8 extends JFrame implements ActionListener {

    private JPanel p1;

    private JLabel l2, l3, l4;
    private JTextField f;
    private JPasswordField p;
    private JButton b;

    public Practical_8() {
        super("Login");

        p1 = new JPanel();

        l2 = new JLabel("Username : \n");
        p1.add(l2);
        f = new JTextField(20);
        p1.add(f);

        l3 = new JLabel("\n Password :", JLabel.LEFT);
        p1.add(l3);
        p = new JPasswordField(20);
        p1.add(p);

        b = new JButton("Login");
        b.addActionListener(this);
        p1.add(b);
        l4 = new JLabel();
        p1.add(l4);
        this.add(p1);
        this.setVisible(true);
        this.setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String x = e.getActionCommand();
        String u = f.getText();
        if (x.equals("Login")) {
            if (u.equals("pavan")) {
                l4.setText("Login successfully ");
            } else {
                l4.setText("incorrect Username or Password");

            }
        }
    }

    public static void main(String[] args) {

        new Practical_8();

    }
}