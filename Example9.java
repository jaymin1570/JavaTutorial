class A{
    int a;
    public A(int x){
        a=x;
        System.out.println("A"+a);
    }
}
class B extends  A{
    int b;
    public B(){
        // super();
        super(4);
        System.out.println("B");
    }
}
class Example9{
    public static void main(String args[]){
        B obj = new B();
    }
}