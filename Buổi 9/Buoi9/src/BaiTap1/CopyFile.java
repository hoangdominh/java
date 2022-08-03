package BaiTap1;

import sun.applet.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyFile {
    public static void main(String[] args) {
//     Đọc và ghi dữ liệu từ file
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("hoang.txt");
            fileOutputStream = new FileOutputStream("hoang_copy.txt");
            int ch;
            while ((ch= fileInputStream.read()) != -1){
                System.out.print((char)ch);
                fileOutputStream.write(ch);
            }
        } catch (Exception ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (fileInputStream !=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileOutputStream !=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
