import java.awt.*;
import javax.swing.*;


public class Nanogram{

    private GridLayout layout;
    private JPanel panel;
    private NanogramCells[][] cells;
    private NanogramCells[] topRowCells;
    private NanogramCells[] leftCollumnCells;
                                                                                                                                                  

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
    topRowCells = new NanogramCells[16];
    for(int i = 0; i < topRowCells.length; i++){
        topRowCells[i] = new NanogramCells();
        topRowCells[i] = cells[0][i];
        topRowCells[i].setBackground(Color.WHITE); // Sets cells background to white
    }

    leftCollumnCells = new NanogramCells[16];
    for(int z = 0; z < leftCollumnCells.length; z++){
        leftCollumnCells[z] = new NanogramCells();
        leftCollumnCells[z] = cells[z][0];
        leftCollumnCells[z].setBackground(Color.WHITE);
    }

    int[] topRowNumbers = {5, 3, 1, 1, 6, 3, 7, 3, 1, 2, 2, 1, 1, 3, 3, 5};
    int[] leftColumnNumbers = {5, 1, 1, 1, 1, 1, 2, 1, 3, 2, 1, 1, 1, 1, 3, 4};

        setTopRowNumbers(topRowNumbers);
        setLeftColumnNumbers(leftColumnNumbers);

        frame.setContentPane(panel);
        frame.setSize(1500, 1500);
        frame.setVisible(true);
    }

    // Method to set numbers for the top row
    private void setTopRowNumbers(int[] numbers) {
        topRowCells = new NanogramCells[16];
        for (int i = 0; i < 16; i++) {
            topRowCells[i] = cells[0][i];
            topRowCells[i].setNumber(numbers[i] + "");
            topRowCells[i].setBackground(Color.WHITE); // Sets cells background to white
        }
    }

    // Method to set numbers for the left column
    private void setLeftColumnNumbers(int[] numbers) {
        leftCollumnCells = new NanogramCells[16];
        for (int i = 0; i < 16; i++) {
            leftCollumnCells[i] = cells[i][0];
            leftCollumnCells[i].setNumber(numbers[i] + "");
            leftCollumnCells[i].setBackground(Color.WHITE); // Sets cells background to white
        }
    }






    }
    


   
