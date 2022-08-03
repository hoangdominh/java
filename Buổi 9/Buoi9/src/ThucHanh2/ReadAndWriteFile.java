package ThucHanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    /*  Phương thức readFile với đối số truyền vào là đường dẫn file mà
        người dùng nhập vào và trả về một List<Integer>
    */
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
//          Đọc file theo đường dẫn
            File file = new File(filePath);
//          Kiểm tra file có tồn tại k
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    //  Phương thức để ghi ra giá trị lớn nhất cần tìm vào trong File
    public void writeFile(String filePath,int max){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất: "+max);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
