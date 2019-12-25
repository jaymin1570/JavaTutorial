public class Test2{
    private static int x;
    static{
        System.out.println("Initilization Block:X="+x);
        x=10;
    }
   
    public static void main(String args[]){
        new Test2();
    }
}