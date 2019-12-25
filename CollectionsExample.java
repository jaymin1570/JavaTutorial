import java.util.*;

public class CollectionsExample{
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(20);        
        v.add(35);
        v.add(33);
        v.add(55);
        System.out.println(v);

        Collections.shuffle(v);

        // Collections.swap(v,0,2);
        System.out.println(v);
 
        // Collections.sort(v);
        // System.out.println(v);
        // int x= Collections.binarySearch(v,35);
        // System.out.println(x);

    }
}