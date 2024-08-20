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

        System.out.println("\nTree-Map Contains: " + m);

        Map<String, Integer> rev = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            rev.put(entry.getKey(), entry.getValue());
        }
        System.out.println("\nTree-Map Contains (reverse): " + rev);
    }
}
