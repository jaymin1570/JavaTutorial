public class GenericExample {
    public <E> void printArray(E [] s) {
        // for (int i = 0; i < s.length; i++) {
            for(E x : s){
            System.out.println(x);
        }
    }
  
    public static void main(String[] args) {
        GenericExample e1 = new GenericExample();
        String countries[] = new String[]{"India","UK","Nepal"};
        Integer numbers[]= {12,34,56,77};
        e1.printArray(countries);
        e1.printArray(numbers);
    }

}