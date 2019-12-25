import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("R");
        t.add("D");
        t.add("C");
        t.add("B");
        t.add("b");
        t.add("r");

        System.out.println(t);

        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("R"));
        System.out.println(t.tailSet("D"));
        System.out.println(t.subSet("D", "b"));
        System.out.println(t.comparator());

    }
}
