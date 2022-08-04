package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        try {
            InputStream is = new FileInputStream("hoang.txt");
            int i;
            // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
            // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
            while ((i=is.read()) !=-1){
                System.out.print((char)i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
