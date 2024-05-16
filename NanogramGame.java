import javax.swing.*;
import java.awt.*;

class NanogramGame {

    private JButton gameButton;

    public NanogramGame() {
        JFrame frame = new JFrame("Nanogram Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Create your Nanogram panel
        JPanel nanogramPanel = new JPanel();
        nanogramPanel.setLayout(new GridLayout(15, 15));
        // Add your Nanogram cells to the panel
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                nanogramPanel.add(new JButton("(" + i + ", " + j + ")"));
            }
        }

        // Create the game button
        gameButton = new JButton("COMPLETE");
        gameButton.setVisible(true);

        // Add the Nanogram panel to the center of the main panel
        panel.add(nanogramPanel, BorderLayout.CENTER);
        // Add the game button to the bottom of the main panel
        panel.add(gameButton, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}