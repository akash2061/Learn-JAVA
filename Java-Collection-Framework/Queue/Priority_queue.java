package Queue;

import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String[] args) {
        // ! PriorityQueue Sorts element in ascending order.
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 5; i > 0; i--) {
            q.add(i);
        }
        System.out.println("\nHead of the queue: " + q.peek());
        System.out.println("\nPolling elements:");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        for (var i : q) {
            System.out.println(i + " ");
        }
        System.out.println("\nHead of the queue: " + q.peek());
        System.out.println("Queue = " + q);

        int[] a = { 10, 1, 0, 50, 20, 15 };
        for (var i : a) {
            q.add(i);
        }
        System.out.println("\nStoring Array into PriorityQueue");
        System.out.println("Queue = " + q);
        while (!q.isEmpty()) {
            System.out.println(q.poll() + "\t:\t" + q.peek());
        }
    }
}
