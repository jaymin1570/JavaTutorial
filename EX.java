 class Person{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;

    }
    public void setName(String n){
        name=n;
    }
    public void getAge(){
        // return(age); 
        System.out.println(age);   
        System.out.println(name);   
    }
    // public Strring getName(){
    //     return(name);
    // }
}

 class Student extends Person{

}

public class Ex{
    public static void main(String []str){
        Student s1 = new Student();
        s1.setName("Ravi");
        s1.setAge(17);
        s1.getAge();
        // s1.getName();
    }
}