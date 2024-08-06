package List;

import java.util.*;
import java.util.Collections;

public class Sorting_l_l_v {
    public static void main(String[] args) {
        // ArrayList<Integer> a = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(40);
        a.add(30);
        a.add(50);
        a.add(20);
        a.add(10);
        Collections.sort(a);
        System.out.println("\nSorted ArrayList:  " + a);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(40);
        b.add(30);
        b.add(50);
        b.add(20);
        b.add(10);
        Collections.sort(b);
        System.out.println("\nSorted LinkedList: " + b);

        Vector<Integer> c = new Vector<>();
        c.add(40);
        c.add(30);
        c.add(50);
        c.add(20);
        c.add(10);
        Collections.sort(c);
        System.out.println("\nSorted Vector:     " + c);
        Collections.sort(c, Collections.reverseOrder());
        System.out.println("\nSorted Reversed:   " + c);

        System.out.println("\nSwaping in C Vector:");
        for (int i = 0; i < 4; i++) {
            Collections.swap(c, i, i + 1);
            System.out.println(c);
        }
        // System.out.println(c);
    }
}
