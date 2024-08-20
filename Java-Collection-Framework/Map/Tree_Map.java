package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("Apple", 3);
        m.put("Orange", 5);
        m.put("Banana", 2);
        m.put("Pumpkin-Seeds", 1);
        m.put("Chocolate-Cake", 4);
        m.put("Avocado", 6);
        System.out.println("\nTree-Map Contains: ");
        for (Map.Entry<String, Integer> i : m.entrySet()) {
            System.out.println(i.getKey() + "    :  " + i.getValue());
        }

        // ! Tree-Map in Reverse Order.
        Map<String, Integer> rev = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            rev.put(entry.getKey(), entry.getValue());
        }
        System.out.println("\nTree-Map Contains (reverse): " + rev);

        // ! Sorting based on numbers:
        Map<Integer, String> m1 = new TreeMap<>();
        for (Map.Entry<String, Integer> v : m.entrySet()) {
            m1.put(v.getValue(), v.getKey());
        }
        System.out.println("\nTree-Map Sorted Key: ");
        for (Map.Entry<Integer, String> i : m1.entrySet()) {
            System.out.println(i.getKey() + "\t:\t" + i.getValue());
        }
    }
}
