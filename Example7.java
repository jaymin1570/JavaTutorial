class A{
    int z;
    public void f1(){

    }
}
class B extends A{
    int z;
    public void f1(){
       // this
        super.f1();
    }
    public void f2(){
        int z;
        z=2;
        this.z=3;
        super.z=4;
    }
}
class Example7{
    public static void main(String args[]){
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}