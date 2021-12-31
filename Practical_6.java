
// Demonstrate some virtual key codes.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="Practical_6" width=300 height=100>
</applet>
*/
public class Practical_6 extends Frame implements KeyListener {
    String msg = "";
    static JLabel showStatus;
    static JLabel text;

    public static void main(String[] args) {

        JFrame f = new JFrame("MouseListener");
        f.setSize(600, 300);

        showStatus = new JLabel("Status");
        text = new JLabel("text");
        showStatus.setBounds(0, 1, 500, 10);
        text.setBounds(20, 20, 1000, 20);
        Practical_6 m = new Practical_6();
        f.addKeyListener(m);
        f.add(showStatus);
        f.add(text);
        f.setVisible(true);

    }

    public void keyPressed(KeyEvent ke) {
        showStatus.setText("KeyDown");
        int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_CAPS_LOCK:
                msg += "<Caps is on>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow>";
                break;
        }
        text.setText(msg);
    }

    public void keyReleased(KeyEvent ke) {
        showStatus.setText("KeyUp");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        text.setText(msg);
    }
}