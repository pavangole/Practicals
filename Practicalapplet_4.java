/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                        /*Practical No :-4 */
    /* Write a Program in java to create a JTable.
*/


import java.applet.Applet;

import javax.swing.*;

public class Practicalapplet_4 extends Applet {

    public void init() {
        makeGUI();
    }

    public void makeGUI() {
        // Initialize column headings.
        String[] colHeads = { "Name", "Extension", "ID#" };
        // Initialize data.

        Object[][] data = { { "Soham", "4567", "865" }, { "Parth", "7566", "555" }, { "Shubham", "5634", "587" },
                { "Vimal", "7345", "922" }, { "Vaibhav", "1237", "333" }, { "C#", "5656", "314" },
                { "C++", "5672", "217" }, { "Python", "6741", "444" }, { "C", "9023", "519" },
                { "Java", "1134", "532" }, { "Farhan", "5689", "112" }, { "Kler", "9030", "133" },
                { "Helen", "6751", "145" } };
        // Create the table.
        JTable table = new JTable(data, colHeads);
        // Add the table to a scroll pane.
        JScrollPane jsp = new JScrollPane(table);
        jsp.setSize(400,150);
        // Add the scroll pane to the content pane.
        add(jsp);
	setLayout(null);
	setVisible(true);

    }

}

/*
 * <applet code="Practicalapplet_4.class" width=500 height=200> </applet>
 */
