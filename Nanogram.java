import java.awt.*;
import javax.swing.*;


public class Nanogram{

    private GridLayout layout;
    private JPanel panel;
    private NanogramCells[][] cells;
    private NanogramCells[] numOfCells;
                                                                                                                                                  

    public Nanogram(){
    JFrame frame = new JFrame("**Nanograme Puzzle**");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    
    panel = new JPanel();
    layout = new GridLayout(16,16);//Grid of Nanogram (allows numbers on top)
    panel.setLayout(layout);

    cells = new NanogramCells[16][16];

    for (int i = 0; i < 16; i++) {
        for (int j = 0; j < 16; j++) {
            NanogramCells cell = new NanogramCells();
            cells[i][j] = cell; // Store the cell in the array
            panel.add(cell); // Add the cell to the panel
        }
    }

    //Set the outer cells with integers in them with different color
    numOfCells = new NanogramCells[30];
    for(int i = 0; i < numOfCells.length; i++){
        numOfCells[i] = new NanogramCells();
    }
    
    NanogramCells numCell1 = numOfCells[0];
    numOfCells[0] = cells[0][0];
    numOfCells[0].setBackground(Color.WHITE);


    
    

    frame.setContentPane(panel);
    frame.setSize(1500,1500);
    frame.setVisible(true); //See the Layout of Panel





    }
    


   
}