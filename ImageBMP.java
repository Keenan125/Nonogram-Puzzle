import java.io.*;

public class ImageBMP{

    public InputStream fileInput;
    public File newfile;

    public ImageBMP() throws FileNotFoundException{

        fileInput = new FileInputStream("bmp-files/elephant.bmp");
        newfile = new File("bmp-files/elephant.bmp");

        fileInput = new FileInputStream(newfile);


    }

    public int read(int r) throws IOException{
        


        return r;
    }



    
}