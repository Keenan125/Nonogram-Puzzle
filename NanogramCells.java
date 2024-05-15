import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class NanogramCells extends JButton implements ActionListener{

    private boolean isPressed;
    private int pixel;


    public NanogramCells(int pixel){

        this.pixel = pixel;

        setBackground(Color.yellow); //Sets cell to start white
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Sets border to black

       addActionListener(this);

       isPressed = false;

    }

    public int getPixel(){

        return pixel;

    }


    public boolean isFilled(){

        return isPressed;
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