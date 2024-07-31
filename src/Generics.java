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
    }

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
