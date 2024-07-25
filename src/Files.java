import java.io.File;

public class Files {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File exists: " + file.getName() + "\nPath: " + file.getAbsolutePath());
            System.out.println("Is it a File? " + file.isFile());
        } else {
            System.out.println("File does not exist.");
        }
    }
}