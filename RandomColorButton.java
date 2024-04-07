
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class RandomColorButton {

  RandomColorButton() {
    JFrame frame = new JFrame(" color chane ");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    JLabel area = new JLabel();
    JButton button = new JButton("click to change background color ");
    button.addActionListener(new ActionListener() {
      // @Override
      public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color randomColor = new Color(red, green, blue);

        panel.setBackground(randomColor);
      }
    });
    panel.add(button, BorderLayout.CENTER);
    frame.add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    RandomColorButton obj = new RandomColorButton();

  }
}