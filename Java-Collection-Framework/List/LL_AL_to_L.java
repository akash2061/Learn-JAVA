package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LL_AL_to_L {
    public static long a_t1 = 0;
    public static long a_t2 = 0;
    public static long l_t1 = 0;
    public static long l_t2 = 0;
    public static long v_t1 = 0;
    public static long v_t2 = 0;

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");

        LinkedList<Integer> l = new LinkedList<>();
        l.add(4);
        l.add(5);
        l.add(6);

        Vector<Object> v = new Vector<>();
        v.add(1);
        v.add("Z");
        v.add(3.14159265358979323846);
        v.add('x');

        To_List("ArrayList", a);
        To_List("LinkedList", l);
        To_List("Vector", v);

        ArrayList<Integer> a1 = new ArrayList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        Vector<Integer> v1 = new Vector<>();
        ms_time_back("ArrayList", a1); // ! Adding elements to back
        ms_time_back("LinkedList", l1);
        ms_time_back("Vector", v1);

        total_time();
    }

    private static <T> void To_List(String type, List<T> list) {
        System.out.println("\n" + type);
        for (T i : list) {
            System.out.println("\t" + i.getClass().getName() + "\t:\t" + i);
        }
    }

    private static void ms_time_back(String type, List<Integer> list) {
        System.out.println("\nAdding items at the end of a 1E5:  " + type);
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long s = System.currentTimeMillis();
        for (int i = 0; i < 1E6; i++) {
            list.add(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("Time Taken to add 1E6 (1_000_000): " + (e - s) + "ms for " + type);
        list.clear();

        System.out.println("\nAdding items at the front of a 1E5:       " + type);
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }
        long e1 = System.currentTimeMillis();
        System.out.println("Time Taken to add 1E5 (100_000) at Front: " + (e1 - s1) + "ms for " + type);
        list.clear();

        if (type.equals("ArrayList")) {
            a_t1 = e - s;
            a_t2 = e1 - s1;
        } else if (type.equals("LinkedList")) {
            l_t1 = e - s;
            l_t2 = e1 - s1;
        } else if (type.equals("Vector")) {
            v_t1 = e - s;
            v_t2 = e1 - s1;
        }
    }

    public static void total_time() {
        System.out.println("\n\nTime Difference in ArrayList:\n\tBack: \t" + a_t1 + "ms");
        System.out.println("\tFront:\t" + a_t2 + "ms");
        System.out.println("\n\nTime Difference in LinkedList:\n\tBack: \t" + l_t1 + "ms");
        System.out.println("\tFront:\t" + l_t2 + "ms");
        System.out.println("\n\nTime Difference in Vector:\n\tBack: \t" + v_t1 + "ms");
        System.out.println("\tFront:\t" + v_t2 + "ms");
    }
}
