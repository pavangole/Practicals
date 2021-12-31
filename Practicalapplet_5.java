/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                        /*Practical No :-5 */
/* Write a Program in java to create a JProgressBar.
*/

import java.applet.*;
import java.nio.channels.spi.SelectorProvider;

import javax.swing.*;
import java.util.Timer;

public class Practicalapplet_5 extends Applet {
    public void init() {
        JProgressBar jb;
        int i = 0, num = 0;
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250, 150);
        setLayout(null);
        setVisible(true);
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 20;
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }

    }

}

/*
 * <applet code="Practicalapplet_5.class" width=500 height=200> </applet>
 */
