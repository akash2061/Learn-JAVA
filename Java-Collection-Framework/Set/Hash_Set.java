package Set;
// ? Observation: Collects only unique elements.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter 5 Elements in Set (including duplicate):");
        for (int i = 0; i < 5; i++) {
            try {
                int x = scan.nextInt();
                s.add(x);
            } catch (Exception e) {
                System.err.println(e);
                scan.next();
            }
        }
        scan.close();

        System.out.println("\nSize = " + s.size());
        System.out.println("Elements:");
        for (var i : s) {
            System.out.println(i);
        }
        s.add(null);
        System.out.println("Allow null value:");
        for (var i : s) {
            System.out.println(i);
        }

        Set<String> names = new HashSet<>(1);
        names.add("null");
        names.add("null");
        for (var i : names) {
            System.out.println("\nNames contains: " + i);
        }
        System.out.println();
        System.out.println(s);
        System.out.println(names);

        s.clear();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("\nList Contains:");
        System.out.println(list);
        System.out.println("\nRemoving Duplicates:");
        s.addAll(list);
        list.clear();
        list.addAll(s);
        System.out.println(list);
        list.clear();
        s.clear();
    }
}
