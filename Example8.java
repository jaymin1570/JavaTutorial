class Parent{
    static int y=4;
    public static void f1(){
        System.out.println("Hello..");
    }

}
class Child extends Parent{
    static{
        y=5;
    }
    public static void f2(){
        System.out.println("Yo man");
    }
}
public class Example8{
    public static void main(String args[]){
        Child.f2();
        System.out.println("Y="+Child.y);
    }
}