
/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
                                        /*Practical No :-4 */
    /* Write a Program in java to create a JTable.
*/


import javax.swing.*;

public class Practical_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table");

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
        JScrollPane jsp = new JScrollPane(table);
        jsp.setSize(400, 150);
        frame.add(jsp);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
