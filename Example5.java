// class Dummy{
//     public final void somefunction(){

//     }
// }
// class MoreDummy extends Dummy{
//     public void somefunction(){

//     }
// }
public class Example5{
    private final int x; //final instance member variable
    private final static int y;//final static member function
    //{ x=20;} // instance initilization
    static{
        y=4;
    }
    Example5(){
        x=20;
    }
    public void fun(){
        final int k=10;//final local variable
        // return 0;
    }
    public static void main(String args[]){
        Example5 e1 = new Example5();
        // System.out.println("answer="+ e1.fun());
    }
}