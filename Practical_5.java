

/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                        /*Practical No :-5 */
/* Write a Program in java to create a JProgressBar.
*/

import javax.swing.*;

public class Practical_5 extends JFrame {
    JProgressBar jb;
    int i = 0, num = 0;

    Practical_5() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250, 150);
        setLayout(null);
    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 20;
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        Practical_5 m = new Practical_5();
        m.setVisible(true);
        m.iterate();
    }
}