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
        System.out.println("\nSorted LinkedList: " + a);

        Vector<Integer> c = new Vector<>();
        c.add(40);
        c.add(30);
        c.add(50);
        c.add(20);
        c.add(10);
        Collections.sort(c);
        System.out.println("\nSorted Vector:     " + a);
    }
}
