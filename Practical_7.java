import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Practical_7 extends Frame implements MouseListener, MouseMotionListener {

    static JLabel mouse_up_down, m_en_ex_click_move, mousedragged;
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public static void main(String[] args) {

        JFrame f = new JFrame("MouseListener");
        f.setSize(600, 300);

        mouse_up_down = new JLabel("No Event");
        mouse_up_down.setBounds(0, 0, 500, 30);

        m_en_ex_click_move = new JLabel("no event ");
        m_en_ex_click_move.setBounds(0, 220, 500, 30);

        mousedragged = new JLabel("*");

        Practical_7 m = new Practical_7();
        f.addMouseMotionListener(m);
        f.addMouseListener(m);

        f.add(mouse_up_down);
        f.add(m_en_ex_click_move);
        f.add(mousedragged);

        f.setVisible(true);

    }

    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouse_up_down.setText("Down");
        mouse_up_down.setBounds(mouseX, mouseY, 200, 10);
    }

    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouse_up_down.setText("Up");
        mouse_up_down.setBounds(mouseX, mouseY, 200, 10);
    }

    public void mouseExited(MouseEvent e) {

        m_en_ex_click_move.setText("Exited " + "(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {

        m_en_ex_click_move.setText(" Entered" + "(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseClicked(MouseEvent e) {

        m_en_ex_click_move.setText("Clicked " + "(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        // show status
        m_en_ex_click_move.setText("Moving " + "(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        // save coordinates
        mousedragged.setBounds(e.getX(), e.getY(), 10, 10);
        m_en_ex_click_move.setText("Dragged " + "(" + mouseX + ", " + mouseY + ")");
    }

}