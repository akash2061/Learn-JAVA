import java.util.Scanner;
import java.util.Random;

public class Main {
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
        // scanner.close();

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
        System.out.println("Max:\t" + Math.max(pi, d));
        System.out.println("Min:\t" + Math.min(pi, d));
        System.out.println("Abs:\t" + Math.abs(d));
        System.out.println("Sqrt:\t" + Math.sqrt(pi));
        System.out.println("Round:\t" + Math.round(pi));
        System.out.println("Ceil:\t" + Math.ceil(pi));
        System.out.println("Floor:\t" + Math.floor(pi));

        // ! Calculate Hypotenous
        double base, side;
        // Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base : ");
        base = scanner.nextDouble();

        System.out.println("Enter side : ");
        side = scanner.nextDouble();

        double hypo = Math.sqrt((base * base) + (side * side));
        System.out.println("The hypotenous is " + hypo);

        // ! Random Values
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println("Random x = " + x);
        double y = random.nextDouble();
        System.out.println("Random y = " + y);
        boolean z = random.nextBoolean();
        System.out.println("Random z = " + z);
    }
}
