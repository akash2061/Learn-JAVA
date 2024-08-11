package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        // ! Find 1st & last occurences of 'x' in array using ArrayList.
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(-1, -1));
        int[] a = { 1, 2, 3, 4, 4, 4, 6, 4, 8 };
        int n = a.length;
        int x = 4;
        // Iterate through the array once
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                // If it's the first occurrence
                if (ans.get(0) == -1) {
                    ans.set(0, i);
                }
                // Update last occurrence
                ans.set(1, i);
            }
        }
        System.out.print("\nArray A = { ");
        for (var i : a) {
            System.out.print(i + " ");
        }
        System.out.println("}\n1st & Last Occorence of " + x + ":\n" + ans);

        ArrayList<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        ArrayList<Integer> num = new ArrayList<>(odd);
        System.out.println(num);

        System.out.println("\nIterate into l_2 using iterator:");
        Iterator<Integer> iter = l_2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ArrayList<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(3);
        r.add(5);
        r.add(7);
        r.add(9);

        System.out.println("\nList r:   " + r);
        System.out.println("List l_2: " + l_2);
        l_2.retainAll(r);
        System.out.println("\nRetainAll Values of l_2 - r: " + l_2);
    }
}