package List;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(null);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(0, 5);

        System.out.println("\nElements in LinkedList: ");
        for (var v : l) {
            System.out.println(v);
        }
        System.out.println("\n" + l);
        System.out.println("\nFirst Element: " + l.getFirst());
        System.out.println("Last Element:  " + l.getLast());
        l.remove(1);
        l.removeFirst();
        l.removeLast();
        System.out.println("\nRemoved First && Last && 1st index element: " + l);
        l.clear();
    }
}
