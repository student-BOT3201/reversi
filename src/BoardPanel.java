import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    public JButton[][] cells = new JButton[8][8];

    public BoardPanel() {
        setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new JButton();
                add(cells[i][j]);
            }
        }
    }
}
