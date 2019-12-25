import java.io.IOException;

public class ThrowsExample {
    public static void main(String []args) //throws IOException
    {   
        try{
            throw new IOException();
             // System.out.println("After Exception");
        }catch(IOException e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}