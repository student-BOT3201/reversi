import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Reversi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new BoardPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
