package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // ! List.
        List<String> l_1 = new ArrayList<>();

        l_1.add("Apple");
        l_1.add("Banana");
        l_1.add("Cherry");
        l_1.add("Apple"); // ! Duplicate
        l_1.add("Oranges");

        System.out.println("\nElements: " + l_1);
        System.out.println("Size: " + l_1.size());
        System.out.println("\nElement at index 1: " + l_1.get(1));
        System.out.println("\nElement in List:");
        for (String f : l_1) {
            System.out.println(f);
        }

        System.out.println("\nSet Value 1 to NULL:");
        l_1.set(1, null);
        for (String f : l_1) {
            System.out.println(f);
        }

        l_1.remove(1);
        System.out.println("\nRemove 1st occurence of Apple:");
        l_1.remove("Apple");
        for (String f : l_1) {
            System.out.println(f);
        }
        System.out.println();

        List<String> subList = l_1.subList(0, 2);
        System.out.println("SubList from index 0 to 2: " + subList);
        System.out.println("Original List:             " + l_1);
        l_1.clear();

        List<Integer> l_2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nArray-List of Integers:");
        for (var el : l_2) {
            System.out.println(el);
        }
        System.out.println("\nArray-List of Integers: " + l_2);
    }
}