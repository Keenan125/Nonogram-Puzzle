import java.io.*;

public class ImageBMP{

    public InputStream fileInput;
    public File newfile;

    public ImageBMP() throws FileNotFoundException{

        this.fileInput = new FileInputStream("elephant.bmp");

        





    }

    public int read(int b) throws IOException{

        byte[] byteRead = new byte[225];

        fileInput.skip(61); //skip first 61 bytes

        int i = 62;
        while(i >= 62){
            fileInput.read();
        }



        




        return read(b);
    }



    
}