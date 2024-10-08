package List;

import java.util.Vector;
import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(null);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(0, 5);

        System.out.println("\nElements in Vector: ");
        for (var x : v) {
            System.out.println(x);
        }
        System.out.println("\n" + v);
        System.out.println("\nFirst Element: " + v.getFirst());
        System.out.println("Last Element:  " + v.getLast());
        v.remove(1);
        v.removeFirst();
        v.removeLast();
        System.out.println("\nRemoved First && Last && 1st index element: " + v);
        v.clear();

        // ! Take input.
        System.out.println("\nEnter 5 Element to Vector:");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                int x = s.nextInt();
                v.add(x);
            } catch (Exception e) {
                System.err.println("Invalid input: " + e.getMessage());
                s.nextLine();
            }
        }
        s.close();
        System.out.println("\nLinked-List Contains: " + v);

        // ! store multi-type in vector {rawtype vector} or {Object}
        Vector<Object> a = new Vector<>();
        a.add(1);
        a.add(2);
        a.add("Hello");
        a.add("hii");
        a.add(3);
        System.out.println("\nObject Type Vector: " + a);

        @SuppressWarnings("unchecked")
        Vector<Integer> y = (Vector<Integer>) v.clone();
        System.out.println("\nClone Vector v to y: " + y);

        Object[] array = new Object[5];
        a.copyInto(array);
        System.out.println("\nCopy Object-Vector to Object-Array: ");
        // for (var i : array) System.out.print(i + " ");
        for (Object i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nTo String: " + a.toString());
        System.out.println("Hash Code of v: " + v.hashCode());
    }
}
