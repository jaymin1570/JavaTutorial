class Outer {
    // static class Inner{ //static inner class
         int x=10;
    protected class Inner {
        void if1() {
            System.out.println("if1() : "+x);
        }
    }
}

public class InnerExample {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner obj = out.new Inner();

        // Outer.Inner obj= new Outer.Inner(); //Static Inner class object

        obj.if1();
    }
}