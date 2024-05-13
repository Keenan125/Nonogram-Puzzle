import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class NanogramCells extends JButton implements ActionListener{

    private boolean isPressed;


    public NanogramCells(){

        setBackground(Color.yellow); //Sets cell to start white
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Sets border to black

       addActionListener(this);

       isPressed = false;

    }

    public void setNumber(String number) {
        setText(number); // text of button
        setOpaque(false); // make cell invisble 
        setContentAreaFilled(false); 
        setBorderPainted(false);  // hide the border of cell
        setHorizontalAlignment(SwingConstants.CENTER); 
        setFont(new Font("Arial", Font.BOLD, 14)); 
        setForeground(Color.BLACK); // make color black
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