package Map;

import java.util.Map;
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Apple", 3);
        m.put("Banana", 2);
        m.put("Orange", 5);

        String orange = "Orange";
        String foo = "Foo";

        m.put(orange, orange.hashCode()); //? Replace value (5) with hashCode.
        m.put(foo, foo.hashCode());

        System.out.println("\nMap: " + m);
    }
}
