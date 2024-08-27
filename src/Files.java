import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File exists: " + file.getName() + "\nPath: " + file.getAbsolutePath());
            System.out.println("Is it a File? " + file.isFile());
        } else {
            System.out.println("File does not exist.");
        }
        w(file);
    }

    public static void w(File f) throws IOException {
        if (!f.exists()) {
            System.out.println("File does not exist.");
        }
        try (FileWriter W = new FileWriter(f)) {
            W.write("Hello Java.");
        }
    }
}