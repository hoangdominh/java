import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);

            while (true) {
//              Đọc dữ liệu kiểu Int readInt
                System.out.println(din.readInt());
            }
        }
        catch (EOFException e){

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
