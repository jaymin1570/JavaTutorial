import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("one");
        h.add("two");
        h.add("three");
        h.add("four");
        h.add("Five");
        h.add("one");
        h.add("One");
        System.out.println(h);
    }
}
