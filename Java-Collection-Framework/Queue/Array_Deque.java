package Queue;

/**  
    *ToDo: Add Fiest & Add Last
    *ToDo: Remove Fiest & Remove Last
    *ToDo: Poll Fiest & Poll Last
    *ToDo: Peek Fiest & Peek Last
*/

import java.util.ArrayDeque;


public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        // ! Add Fiest & Add Last
        d.addFirst(10);
        d.addLast(60);
        d.addFirst(0);
        d.addLast(30);
        System.out.println("\nArray-Deque: " + d);
        // ! Remove Fiest & Remove Last
        // ! Poll Fiest & Poll Last
        // ! Peek Fiest & Peek Last
    }
}
