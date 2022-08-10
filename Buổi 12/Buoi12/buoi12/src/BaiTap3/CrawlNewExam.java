package BaiTap3;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewExam {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://bongdaplus.vn/");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+","");
            Pattern p = Pattern.compile("title\">(.*?)</h3>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

