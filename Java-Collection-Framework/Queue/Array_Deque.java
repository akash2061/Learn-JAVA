package Queue;

/**  
    *ToDo: Add Fiest & Add Last
    *ToDo: Remove Fiest & Remove Last
    *ToDo: Poll Fiest & Poll Last
    *ToDo: Peek Fiest & Peek Last
*/

import java.util.ArrayDeque;
import java.util.List;
import java.util.LinkedList;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();

        // ! Add First & Add Last
        d.addFirst(10);
        d.addLast(60);
        d.addFirst(0);
        d.addLast(30);
        d.addLast(30);
        d.addLast(15);
        System.out.println("\nArray-Deque after adding elements: " + d);

        // ! Remove First & Remove Last
        d.removeFirst();
        d.removeLast();
        System.out.println("\nArray-Deque after removing first and last elements: " + d);

        // ! Poll First & Poll Last
        Integer firstPolled = d.pollFirst();
        Integer lastPolled = d.pollLast();
        System.out.println("\nFirst polled element: " + firstPolled);
        System.out.println("Last polled element: " + lastPolled);
        System.out.println("Array-Deque after polling first and last elements: " + d);

        // ! Peek First & Peek Last
        Integer firstPeeked = d.peekFirst();
        Integer lastPeeked = d.peekLast();
        System.out.println("\nFirst element (peek): " + firstPeeked);
        System.out.println("Last element (peek): " + lastPeeked);
        System.out.println("Array-Deque after peeking first and last elements: " + d);

        // ! remove mid element
        d.push(0);
        System.out.println("\nArray-Deque: " + d);
        int mid = d.size() / 2;
        List<Integer> list = new LinkedList<>(d);
        list.remove(mid);
        d.clear();
        d.addAll(list);
        System.out.println("Array-Deque after removing mid element: " + d);
    }
}
