import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class focusEvents {
  public void focusEvents() {
    JFrame frame = new JFrame("Focus Event Example");

    // Create two text fields
    JTextField textField1 = new JTextField(20);
    JTextField textField2 = new JTextField(20);

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    JPanel panel = new JPanel();
    panel.add(textField1);
    panel.add(textField2);

    textField1.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        System.out.println("Focus gained on TextField 1");
      }

    });

    frame.add(panel);
    frame.setVisible(true);

  }

  public static void main(String[] args) {
    focusEvents obj = new focusEvents();
  }
}
