import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class NanogramCells extends JButton implements ActionListener{

    private boolean isPressed;
    private int pixel;


    public NanogramCells(int pixel){

        this.pixel = pixel;

        this.setBackground(Color.WHITE); //Sets cell to start white
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Sets border to black

       addActionListener(this);

       isPressed = false;

    }

    public int getPixel(int pixelVal){

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
            setBackground(Color.WHITE);
        }

        

    }



    
}