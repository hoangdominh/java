package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2  {

    public static void main(String[] args) throws IOException {
        try {
            InputStream in = new FileInputStream("hoang.txt");
            byte[] bytes = new byte[10];
            int i =0;
            // Đọc các byte trong luồng và gán lên các phần tử của mảng.
            // Giá trị i là số đọc được của 1 lần (i sẽ <=10)
            while ((i=in.read(bytes)) !=-1){
                String s = new String(bytes,0,i);
                System.out.println(s);
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
