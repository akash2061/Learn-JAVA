package Map;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Apple", 3);
        m.put("Banana", 2);
        m.put("Orange", 5);

        String orange = "Orange";
        String foo = "Foo";

        m.put(orange, orange.hashCode()); // ? Replace value (5) with hashCode.
        m.put(foo, foo.hashCode());

        System.out.println("\nMap: " + m);

        // ! ContainsValue && ContainsKey
        var x = m.containsKey("Apple");
        var y = m.containsValue(5);
        System.out.println("\nResult returned by ContainsKey:   " + x);
        System.out.println("Result returned by ContainsValue: " + y);

        System.out.println("\n" + m);
        m.remove("Orange");
        System.out.println(m);

        // ! New Map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i, Integer.hashCode(i));
        }
        System.out.println("\nMap-2: " + map);
        // ! Map is Clear.
        map.clear();

        System.out.println("\n10 random elements (0-2) to find their frequency in Map-2:");
        int max = 2;
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int k = random.nextInt(max - min + 1) + min;
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        System.out.println("\nMap-2 (Element Frequencies): " + map);

        // ! Iterating over the map's entry set
        System.out.println("\nMap (m):");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // ! Iterate over value
        System.out.println("\nValues:");
        for (var i : m.values()) {
            System.out.println(i);
        }

        System.out.println("\nMap Size: " + m.size());
        m.put(null,0); //! Allows null key
        System.out.println(m);
    }
}
