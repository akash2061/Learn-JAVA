package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash_vs_Tree {
    public static void main(String[] args) {
        Map<String, Integer> hash = new HashMap<>();
        Map<String, Integer> tree = new TreeMap<>();
        long startTime, endTime; // ! Time-delay

        // Insert a large number of elements in HashMap
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hash.put("Key" + i, i);
        }
        endTime = System.nanoTime();
        System.out.println("\nHashMap Insertion Time: " + (endTime - startTime) + " nanoseconds");

        // Insert a large number of elements in TreeMap
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            tree.put("Key" + i, i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeMap Insertion Time: " + (endTime - startTime) + " nanoseconds");

        // Access time comparison
        startTime = System.nanoTime();
        hash.get("Key500000");
        endTime = System.nanoTime();
        System.out.println("\nHashMap Access Time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        tree.get("Key500000");
        endTime = System.nanoTime();
        System.out.println("TreeMap Access Time: " + (endTime - startTime) + " nanoseconds");
    }
}
