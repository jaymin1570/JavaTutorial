public class Test{
    private int x;
    {
        System.out.println("Initialization Block:X="+ x);
        x=5;
    }
    public Test(){
        System.out.println("Constructor:X="+x);
    }
    public static void main(String args[]){
        Test t1 = new Test();
        Test t2 = new Test();
    }
}