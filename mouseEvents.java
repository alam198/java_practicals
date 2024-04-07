import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseEvents {
    public mouseEvents() {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("click me ");

        JLabel label = new JLabel();
        JLabel label2 = new JLabel(" mouse info enter or exit ");

        JPanel panel = new JPanel(new GridLayout(5, 1));

        panel.add(label2);
        panel.add(button);
        panel.add(label);

        // button click events
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "mouse cliked ");
            }
        });

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Moved at ( " + e.getX() + "," + e.getY() + ")");

            }
        });

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label2.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label2.setText("Mouse Exited");
            }
        });

        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        mouseEvents obj = new mouseEvents();
    }
}
