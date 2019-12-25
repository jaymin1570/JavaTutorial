import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String []args) throws IOException {
        File f1 = new File("d:/jaymin/java/name1.text");
        File f2 = new File("d:/jaymin/java/name2.text");
        f1.createNewFile();
        f2.createNewFile();
        System.out.println("Is exist: "+f1.exists());
        System.out.println("File Size: "+f1.length());
        System.out.println("File name: "+f1.getName());
        System.out.println("Can read File : "+f1.canRead());
        System.out.println("Can write File : "+f1.canWrite());
        //f1.delete(); //delete the file
        f2.delete();
    }
}