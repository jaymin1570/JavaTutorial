import java.util.*;

public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("jaymin");      
        list.addLast("Makwana");
        list.add(1,"Cyber_Hunter");
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
} 