import java.io.File;
import java.io.IOException;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("Point.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
