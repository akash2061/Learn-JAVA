public class Overloaded_Method {
    public static void main(String[] args) {
        // ! Overloaded Methods
        int x = add(1, 2);
        int y = add(1, 2, 3);
        int z = add(1, 2, 3, 4);
        System.out.println("Sum: " + x + ", " + y + ", " + z);
        System.out.println();
        double d1 = add(1.5, 2.5);
        double d2 = add(1.5, 2.5, 3.5);
        double d3 = add(1.5, 2.5, 3.5, 4.5);
        System.out.println("Sum: " + d1 + ", " + d2 + ", " + d3);
    }

    static int add(int x, int y) {
        System.out.println("Overloaded Method 1.");
        return x + y;
    }

    static int add(int x, int y, int z) {
        System.out.println("Overloaded Method 2.");
        return x + y + z;
    }

    static int add(int w, int x, int y, int z) {
        System.out.println("Overloaded Method 3.");
        return w + x + y + z;
    }

    static double add(double x, double y) {
        System.out.println("Overloaded Method 4.");
        return x + y;
    }

    static double add(double x, double y, double z) {
        System.out.println("Overloaded Method 5.");
        return x + y + z;
    }

    static double add(double w, double x, double y, double z) {
        System.out.println("Overloaded Method 6.");
        return w + x + y + z;
    }

}
