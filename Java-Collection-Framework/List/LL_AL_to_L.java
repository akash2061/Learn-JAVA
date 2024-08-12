package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LL_AL_to_L {
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
    }

    private static <T> void To_List(String type, List<T> list) {
        System.out.println("\n" + type);
        for (T i : list) {
            System.out.println("\t" + i.getClass().getName() + "\t:\t" + i);
        }
    }
}
