
/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                    /*Practical No :-2 */
/*  Write a Program using Swing to display a ScrollPane and JComboBox in an
    Applet with the item:-English, Marathi, Hindi, and Sanskrit. 
*/

import javax.swing.*;
import java.awt.*;


public class Practical_2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String flags[] = { "English", "Marathi", "Hindi", " Sanskrit", "Urdu", "Arabic", "Ukranian", "Jpanese",
                "Chinese", "Malyanam", "Punjabi" };

        JLabel jb = new JLabel("Country");
        jb.setBounds(20, 20, 100, 20);

        JComboBox jc = new JComboBox<>(flags);
        jc.setBounds(20,60,100,30);
        frame.add(jb);
        frame.add(jc);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
	    frame.setSize(500,500);

    }
}
