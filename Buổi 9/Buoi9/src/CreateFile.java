import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using " + "FileWriter and FileReader";
        FileWriter fw = new FileWriter( "output.txt");

//      Đọc từng kí tự 1
        for (int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        System.out.println("Writing successful");
        fw.close();
    }
}

