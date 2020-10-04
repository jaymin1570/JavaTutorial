class Greeting{
    public void sayHello(){
        System.out.println("Hello...");
    }
}

class India{
    
    Greeting g= new Greeting(){
        public void sayHello(){
            System.out.println("Namaste india good morning .....");
        }
    };
}




public class AnonymousExample{
    public static void main(String []args){
        India india = new India();
        india.g.sayHello();
    }
}