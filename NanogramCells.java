import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.JButton;


public class NanogramCells extends JButton implements ActionListener{

    private boolean isPressed;


    public NanogramCells(){

        setBackground(Color.yellow); //Sets cell to start white
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Sets border to black

       addActionListener(this);

       isPressed = false;

    }

    public void actionPerformed(ActionEvent e){
        isPressed = !isPressed; // allows it to return back to white if pressed accidently

        if(isPressed){
            setBackground(Color.BLACK); //if clicked goes to black
        }
        else{
            setBackground(Color.yellow);
        }

        

    }



    
}