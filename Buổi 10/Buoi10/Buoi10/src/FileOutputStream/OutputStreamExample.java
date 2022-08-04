package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample  {
    public static void main(String[] args) {
        try {
            // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
            OutputStream os = new FileOutputStream("output.txt");
            // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên
            byte[] bytes = new byte[] {'M','i','n','h','H','o','a','n','g'};
            // Ghi lần lượt các ký tự vào luồng
            for (int i =0;i< bytes.length;i++){
                byte b = bytes[i];
                // Ghi ký tự vào luồng
                try {
                    os.write(b);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
