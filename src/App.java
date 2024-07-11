import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // ! Starting
        System.out.println("Hello, World!");

        // ! Variables
        System.out.println("\nVariables:");
        byte b = 127;
        short s = 2000;
        int i = 100;
        double d = 10.5;
        float f = 3.14159f;
        long l = 1000516584351681310L;
        char c = '@';
        boolean bool = true;
        String str = "Morningstar!";

        System.out.println("char:\t" + c);
        System.out.println("boolean:\t" + bool);
        System.out.println("String:\t" + "Hello, " + str);
        System.out.println("long:\t" + l);
        System.out.println("int:\t" + i);
        System.out.println("short:\t" + s);
        System.out.println("float:\t" + f);
        System.out.println("double:\t" + d);
        System.out.println("byte:\t" + b);

        // ! Swap strings
        String str1 = "Water";
        String str2 = "H2O";
        System.out.println("\nStrings before swap:");
        System.out.println("str1:\t" + str1);
        System.out.println("str2:\t" + str2);
        String temp = null;
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("Strings after swap:");
        System.out.println("str1:\t" + str1);
        System.out.println("str2:\t" + str2);
        temp = null;
        System.out.println("\nTemp = " + temp);

        // ! Scanner
        System.out.println("\nScanner:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        scanner.nextLine(); // * Clean the next line.

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("String: " + input);
        scanner.close();

        // ! Expressions
        num = 3;
        System.out.println("Num * 3 = " + num * 3);
        System.out.println("Num - 3 = " + (num - 3));
        System.out.println("Num + 3 = " + (num + 3));
        System.out.println("Num / 3 = " + num / 3);
        System.out.println("Num % 3 = " + num % 3);

        // ! Math
        double pi = 3.141592;
        d = -10.596;
        System.out.println("\nMath");
        System.out.println("Max:" + Math.max(pi, d));
        System.out.println("Min:" + Math.min(pi, d));
    }
}
