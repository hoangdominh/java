package Regex;

public class Test4 {
    public static void main(String[] args) {
        //Tạo chuỗi bằng string literal
        String s1 = "java";
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        //convert mảng char thành chuỗi
        String s2 = new String(ch);
        //Tạo chuỗi bằng từ khóa new
        String s3 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
