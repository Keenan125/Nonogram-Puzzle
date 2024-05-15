import java.awt.*;
import javax.swing.*;


public class Nanogram{

    private JPanel panel;
    private NanogramCells[][] cells;
    private JPanel[] topRow;
    private JPanel[] collumnLeft;
    private JButton button;
    
    
    
                                                                                                                                                  

    public Nanogram(){
    JFrame frame = new JFrame("**Nanograme Puzzle**");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    
    panel = new JPanel();
    panel.setLayout(new BorderLayout());




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

    cells = new NanogramCells[15][15];

    topRow = new JPanel[15]; //15 panels for top row
    collumnLeft = new JPanel[15]; //15 panels for collumn

    for(int y = 0; y < 15; y++){
        topRow[y] = new JPanel(new BorderLayout()); // makes 15 panels
    }

    for(int q = 0; q < 15; q++){
        collumnLeft[q] = new JPanel(new BorderLayout());
    }




    for (int i = 0; i < pixels.length; i++) {
        for (int j = 0; j < pixels[i].length; j++) {
            NanogramCells cell = new NanogramCells(pixels[i][j]);
            cells[i][j] = cell; // Store the cell in the array
            panel.add(cell); // Add the cell to the panel
        }
    }
    //scan rows
    for (int j = 0; j < 15; j++) {
        StringBuilder countBuilder = new StringBuilder();
        int oneCount = 0;
        boolean counting = false;

        for (int i = 0; i < 15; i++) {
            if (pixels[i][j] == 1) {
                oneCount++;
                counting = true;
            } else if (pixels[i][j] == 0 && counting) {
                countBuilder.append(oneCount).append(",");
                oneCount = 0;
                counting = false;
            }
        }

        if (oneCount > 0) {
            countBuilder.append(oneCount);
        }

        JLabel rowLabels = new JLabel(countBuilder.toString(), SwingConstants.CENTER);
        topRow[j].setOpaque(false); //sets transparent
        topRow[j].add(rowLabels, BorderLayout.CENTER);
    }

    // scan the left column
    for (int i = 0; i < 15; i++) {
        StringBuilder countBuilder = new StringBuilder();
        int oneCount = 0;
        boolean counting = false;

        for (int j = 0; j < 15; j++) {
            if (pixels[i][j] == 1) {
                oneCount++;
                counting = true;
            } else if (pixels[i][j] == 0 && counting) {
                countBuilder.append(oneCount).append(",");
                oneCount = 0;
                counting = false;
            }
        }

        if (oneCount > 0) {
            countBuilder.append(oneCount);
        }

        JLabel label = new JLabel(countBuilder.toString(), SwingConstants.CENTER);
        collumnLeft[i].setOpaque(false); //sets transparent
        collumnLeft[i].add(label, BorderLayout.CENTER);
    }

    JPanel nanogramPanel = new JPanel(new GridLayout(15, 15));
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 15; j++) {
            NanogramCells cell = new NanogramCells(pixels[i][j]);
            nanogramPanel.add(cell);
        }
    }

    JPanel topRowPanel = new JPanel(new GridLayout(1, 15));
    for (int i = 0; i < 15; i++) {
        topRowPanel.add(topRow[i]);
    }

    JPanel leftColumnPanel = new JPanel(new GridLayout(15, 1));
    for (int i = 0; i < 15; i++) {
        leftColumnPanel.add(collumnLeft[i]);
    }


    panel.add(nanogramPanel, BorderLayout.CENTER); //sets cells centre
    panel.add(topRowPanel, BorderLayout.NORTH);  //sets row to be up top
    panel.add(leftColumnPanel, BorderLayout.WEST); //sets column to be far left

    button = new JButton("Finished Game!");
    button.setVisible(true);

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); //makes panel for the button to be centred below grid
    buttonPanel.add(button);

    panel.add(buttonPanel, BorderLayout.SOUTH);
    


    


   

        frame.setContentPane(panel);
        frame.setSize(1500, 1500);
        frame.setVisible(true);
    }

   





    }
    


   
