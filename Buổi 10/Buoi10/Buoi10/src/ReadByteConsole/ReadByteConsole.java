package ReadByteConsole;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) {
        InputStream is = System.in;
        while (true){
            System.out.println("Nhập 1 kí tự ");
            try {
                int ch = is.read();
                if (ch == 'q'){
                    System.out.println("Finished!");
                    break;
                }
                is.skip(2); /* Loại bảo 2 kí tự \r và \n */
                System.out.println("Ký tự nhận được: "+(char)ch);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
