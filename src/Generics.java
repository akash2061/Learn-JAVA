public class Generics {
    public static void main(String[] args) {

        Integer[] i = { 1, 2, 3, 4, 5 };
        Double[] d = { 5.61, 4.62, 8.13, 9.84, 3.05 };
        Character[] c = { 'H', 'E', 'L', 'L', 'O' };
        String[] s = { "Hello", "Bye" };

        displayArray(i);
        displayArray(d);
        displayArray(c);
        displayArray(s);

        System.out.println();

        System.out.println(getFirst(i));
        System.out.println(getFirst(d));
        System.out.println(getFirst(c));
        System.out.println(getFirst(s));

        Generics_class<Integer> g = new Generics_class<>(10);
        Generics_class<String> g1 = new Generics_class<>("Generic Class...");
        System.out.println();
        System.out.println(g.getVal());
        System.out.println(g1.getVal());
        System.out.println();
    }

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
}
