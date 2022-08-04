package TestFileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (
            FileOutputStream  fos = new FileOutputStream("temp.dat");
            )
            {
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }
            try (
                    FileInputStream fis = new FileInputStream("temp.dat");
            )
            {
                int value;
                while ((value = fis.read()) != -1){
                    System.out.print(value +" ");
                }
            }
        }
    }
}
