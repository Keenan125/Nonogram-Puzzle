import java.awt.*;
import javax.swing.*;


public class Nanogram{

    private GridLayout layout;
    private JPanel panel;
    private NanogramCells[][] cells;
    private NanogramCells[] topRowCells;
    private NanogramCells[] leftCollumnCells;
    private int collumnCount;
    private int rowCount;
                                                                                                                                                  

    public Nanogram(){
    JFrame frame = new JFrame("**Nanograme Puzzle**");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    
    panel = new JPanel();
    layout = new GridLayout(16,16);//Grid of Nanogram (allows numbers on top)
    panel.setLayout(layout);

    int[][] pixels = {
        {0,0,1,1,0,1,1,1,1,0,1,1,1,0,0},
        {1,1,0,0,1,0,0,0,0,1,0,0,0,1,0},
        {1,0,0,0,0,0,0,0,0,0,0,1,1,1,1},
        {1,0,0,0,1,0,0,1,0,0,1,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
        {1,1,0,1,0,0,1,0,0,0,0,0,0,1,1},
        {0,1,1,1,0,0,1,0,0,1,1,0,1,1,0},
        {0,0,0,1,0,1,1,1,1,1,0,1,1,0,0},
        {0,0,1,1,0,1,0,0,0,0,0,0,1,1,0},
        {0,0,1,0,0,1,1,0,0,1,0,0,0,1,0},
        {0,1,1,0,1,0,1,0,0,1,1,0,0,1,1},
        {1,1,0,0,1,0,1,0,0,1,0,0,0,0,1},
        {1,0,0,1,1,0,1,0,0,1,0,0,0,0,1},
        {1,1,1,0,1,0,1,0,0,1,0,0,0,1,1},
        {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1}};

    cells = new NanogramCells[16][16];

    for (int i = 0; i < 16; i++) {
        for (int j = 0; j < 16; j++) {
            NanogramCells cell = new NanogramCells(0);
            cells[i][j] = cell; // Store the cell in the array
            panel.add(cell); // Add the cell to the panel
        }
    }

    //Set the outer cells with integers in them with different color
    topRowCells = new NanogramCells[16];
    for(int i = 0; i < topRowCells.length; i++){
        topRowCells[i] = new NanogramCells(0);
        topRowCells[i] = cells[0][i];
        topRowCells[i].setBackground(Color.WHITE); // Sets cells background to white
    }

    leftCollumnCells = new NanogramCells[16];
    for(int z = 0; z < leftCollumnCells.length; z++){
        leftCollumnCells[z] = new NanogramCells(0);
        leftCollumnCells[z] = cells[z][0];
        leftCollumnCells[z].setBackground(Color.WHITE);
    }

    





 

        frame.setContentPane(panel);
        frame.setSize(1500, 1500);
        frame.setVisible(true);
    }

   





    }
    


   
