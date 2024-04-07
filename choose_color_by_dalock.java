import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choose_color_by_dalock extends JFrame {

  public choose_color_by_dalock() {
    setTitle("ScrollPane Color Chooser Demo");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JTextArea textArea = new JTextArea();
    textArea.setText("This is a JTextArea inside a JScrollPane.");
    JScrollPane scrollPane = new JScrollPane(textArea);
    JPanel panel = new JPanel();

    // Create a button to open color chooser
    JButton colorButton = new JButton("Choose Color");
    colorButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Open color chooser dialog
        Color newColor = JColorChooser.showDialog(choose_color_by_dalock.this, "Choose Background Color",
            textArea.getBackground());
        if (newColor != null) {
          // Set background color of content pane
          textArea.setBackground(newColor);
        }
      }
    });

    panel.setLayout(new BorderLayout());
    panel.add(scrollPane, BorderLayout.CENTER);
    panel.add(colorButton, BorderLayout.SOUTH);

    setContentPane(panel);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(choose_color_by_dalock::new);
  }
}
