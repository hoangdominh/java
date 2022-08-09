package BaiThucHanh3;

import javafx.scene.shape.SVGPath;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException, IOException {

//        try{
//
//        }catch (MalformedURLException e){
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e){
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        Khởi tạo đường dẫn thư viện nhạc muốn lấy danh sách bài hát
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//        Mở stream và đưa nó vào InputStreamReader
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();

//        Xóa tất cả các new line trong content lấy được
        content = content.replaceAll("\\n","");

//        Lọc nội dung content lấy được trong tag a chứa class name_song

        Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
        Matcher m = pattern.matcher(content);
        while (m.find()){
            System.out.println(m.group(1));
        }
    }
}
