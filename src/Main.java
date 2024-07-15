import java.util.Scanner;
import java.util.ArrayList;
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
        System.out.println("\nCalculate Hypotenous:");
        double base, side;
        // Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base : ");
        base = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter side : ");
        side = scanner.nextDouble();
        scanner.nextLine();
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

        // ! Conditional Statements
        int age = random.nextInt(100) + 1;
        System.out.println("\nConditional Statements:");
        if (age >= 18) {
            System.out.println("You are an adult. " + "Age : " + age);
        } else if (age >= 13) {
            System.out.println("You are a teenager. " + "Age : " + age);
        } else {
            System.out.println("You are a child. " + "Age : " + age);
        }

        // ! Switch Case
        System.out.println("\nSwitch Case:");
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int randomIndex = random.nextInt(days.length);
        String day = days[randomIndex];
        switch (day) {
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid day options");
                break;
        }

        // ! While Loop
        System.out.println("\nWhile Loop:");
        scanner.nextLine();
        String name = "";
        while (name.isBlank()) {
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        // ! Do-While Loop
        System.out.println("\nDo-While Loop:");
        i = 0;
        do {
            System.out.println("Value: " + i);
            i++;
        } while (i <= 3);

        // ! For Loop
        System.out.println("\nFor Loop:");
        System.out.println("Total Days in Array:");
        for (i = 0; i < days.length; i++) {
            System.out.println(i + "\t:\t" + days[i]);
        }

        // ! Nested Loop & Patterns
        System.out.println("\nNested Loop:");
        i = 5;
        for (int o = 1; o <= 5; o++) {
            for (int in = o; in < 5; in++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int o = 1; o <= 5; o++) {
            for (int in = o; in < 5; in++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * o - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int o = 5; o > 0; o--) {
            for (int in = 5; in > o; in--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * o - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        i = 5;
        for (int o = 5; o > 0; o--) {
            for (int in = 5; in > o; in--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ! Array
        System.out.println("\nArray:");
        char[] Alpha = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println("Array Length: " + Alpha.length);
        for (i = 0; i < Alpha.length; i++) {
            System.out.println(Alpha[i]);
        }
        String[] Cars = new String[2];
        Cars[0] = "Toyota";
        Cars[1] = "Camaro";
        System.out.println("\nFor-Each Loop:");
        i = 0;
        for (String car : Cars) {
            System.out.println(i + "\t:\t" + car);
            ++i;
        }

        // ! 2D Array
        System.out.println("\n2D Array:");
        int[][] Matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Matrix Rows: " + Matrix.length);
        System.out.println("Matrix Columns: " + Matrix[0].length);
        System.out.println();
        for (int[] row : Matrix) {
            for (int value : row) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }

        // ! Array List
        System.out.println("\nArrayList:");
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Tiger");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
