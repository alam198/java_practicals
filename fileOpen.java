import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileOpen extends JFrame {

  private JTextArea textArea;

  public fileOpen() {
    setTitle("Text File Viewer");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Create JTextArea inside JScrollPane
    textArea = new JTextArea("this is defult text ");
    textArea.setBackground(Color.ORANGE);
    JScrollPane scrollPane = new JScrollPane(textArea);

    // Create JButton to open file chooser
    JButton openButton = new JButton("Open File");
    openButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(fileOpen.this);
        if (option == JFileChooser.APPROVE_OPTION) {
          File selectedFile = fileChooser.getSelectedFile();
          displayFileContent(selectedFile);
        }
      }
    });

    // Add components to the frame
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(scrollPane, BorderLayout.CENTER);
    panel.add(openButton, BorderLayout.SOUTH);
    setContentPane(panel);
    setVisible(true);
  }

  private void displayFileContent(File file) {
    StringBuilder content = new StringBuilder();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line;
      while ((line = reader.readLine()) != null) {
        content.append(line).append("\n");
      }
      reader.close();
      textArea.setText(content.toString());
    } catch (Exception e) {
      System.out.println(" file open error ");
    }
  }

  public static void main(String[] args) {
    fileOpen obj = new fileOpen();
  }
}
