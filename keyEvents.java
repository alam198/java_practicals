import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyEvents {
  public keyEvents() {
    JFrame frame = new JFrame();
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea textArea = new JTextArea("this is text area ");
    JLabel lebel = new JLabel();
    JLabel label2 = new JLabel("key press");
    JLabel label3 = new JLabel("key released ");

    JPanel panel = new JPanel(new GridLayout(5, 1));
    panel.add(textArea);
    panel.add(lebel);
    panel.add(label2);
    panel.add(label3);

    textArea.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {

        lebel.setText("key type :=  " + e.getKeyChar());
        label2.setText("key press := " + +e.getKeyChar());
      }

    });

    textArea.addKeyListener(new KeyAdapter() {
      @Override
      public void keyTyped(KeyEvent e) {

        label3.setText("key released := " + e.getKeyChar());
      }

    });
    frame.add(panel, BorderLayout.CENTER);
    frame.setVisible(true);

  }

  public static void main(String[] args) {
    keyEvents key = new keyEvents();

  }
}
