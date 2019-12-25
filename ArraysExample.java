import java.util.*;

public class ArraysExample{
    public static void main(String[] args) {
        int []a = new int[10];
        Arrays.fill(a,5);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        Arrays.fill(a,5,9,1);
        System.out.println("");

        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        // Arrays.sort(a,2,5);
        // System.out.println("");
        // for(int i=0; i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        
    }
}