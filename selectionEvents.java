
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class selectionEvents extends JFrame {
    private JList<String> list;

    public selectionEvents() {
        setTitle("List Selection Example");

        String[] data = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
        list = new JList<>(data);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValue());
                }
            }
        });

        add(new JScrollPane(list));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new selectionEvents());
    }
}
