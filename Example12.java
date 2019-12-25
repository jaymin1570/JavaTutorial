class Person{
    abstract void show();
}
class Student extends Person{
    void show(){
        //Some code
    }
}
public class Example11{
    public static void main(String args[]){
        Student s= new Student();
        s.show();
    }
}