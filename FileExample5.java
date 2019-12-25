import java.io.*;

class FileExample5 {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader bf = new BufferedReader(new FileReader("d:/jaymin/java/myfile.text"));

        char []s = new char[20];
        bf.read(s,2 ,15);
        System.out.println(s);

        // String s1;
        // while ((s1 = bf.readLine()) != null) {
        //     System.out.println(s1);
        // }

        // while((ch=bf.read())!=-1){
        // System.out.println((char)ch);
        // }
        bf.close();
    }
}