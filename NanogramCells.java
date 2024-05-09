import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.JButton;


public class NanogramCells extends JButton implements ActionListener{


    public NanogramCells(){

        setBackground(Color.WHITE); //Sets cell to start white
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Sets border to black

       addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

    }



    
}