package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
//          Đọc file theo đường dẫn
            File file = new File(filePath);
//          Kiểm tra xem file có tồn tại, nếu không tồn tại thì ném ra ngoại lệ
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line= br.readLine())!= null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
//          Hiện ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = "+sum);

        } catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
