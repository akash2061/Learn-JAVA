package Set;
// ? Observation: Collects only unique elements & order them in Ascending order.

import java.util.HashSet;
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
    }
}
