class A{  //Car
    public void f1(int x){
        System.out.println("class A");
    }
   
    
}
class B extends A{ //Sports Car
    public void f1(int x){
        System.out.println("class B");
    }
}

public class Example4{
    public static void main(String args[]){
        // B objb = new B();
        B objb = new B();
        objb.f1(5);
        obja.f1(3,4);
        // objb.f1(3);
    }
}