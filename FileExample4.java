import java.io.*;

class FileExample4
 {
    public static void main (String [] args)throws IOException{
        FileWriter fw= new FileWriter("d:/jaymin/java/myfile.text",true);
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("Computer");
        bf.close();
    }
}