import java.util.*;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList l2 = new ArrayList(3);
        l2.add("Sahal");
        l2.add(31);
        l2.add("mahendra");
        l2.add(42);
        ArrayList l1 = new ArrayList(l2);
        l1.add("jaymin");
        l1.add("mehul");
        l1.add(29);
        l1.add(1,"Jammu");
        l1.add("Jammu");
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}   