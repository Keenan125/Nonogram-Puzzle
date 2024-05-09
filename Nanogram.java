import java.awt.*;
import javax.swing.*;


public class Nanogram{

    private GridLayout layout;
    private JPanel panel;
                                                                                                                                                  

    public Nanogram(){
    JFrame frame = new JFrame("**Nanograme Puzzle**");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel = new JPanel();
    layout = new GridLayout(15,15);//15x15 Grid of Nanogram
    panel.setLayout(layout);

    for (int i = 0; i < 15 * 15; i++) {
        NanogramCells cells = new NanogramCells(); // A simple JButton
        panel.add(cells); // Adding the button to the panel
    }



    frame.setContentPane(panel);
    frame.setSize(1500,1500);
    frame.setVisible(true); //See the Layout of Panel





    }
    


   
}