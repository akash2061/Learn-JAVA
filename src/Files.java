import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("\nFile exists: " + file.getName() + "\nPath: " + file.getAbsolutePath());
            System.out.println("Is it a File? " + file.isFile());
        } else {
            System.out.println("\nFile does not exist.");
        }
        w(file);
    }

    public static void w(File f) throws IOException {
        if (!f.exists()) {
            System.out.println("File does not exist.");
        }
        try (FileWriter W = new FileWriter(f, true); // 'true' for appending to file
                Scanner s = new Scanner(System.in)) {

            System.out.println("\nEnter a String to add to File: " + f.getAbsolutePath());
            System.out.println("Type 'exit' to stop writing.");

            while (true) {
                String input = s.nextLine(); // Read the entire line
                if (input.equals("exit")) {
                    break;
                }
                W.write(input + System.lineSeparator()); // Add newline after each input
            }
        }
    }
}