package Regex;

// Sử dụng Regex trong Java - xác thực email

import java.util.regex.Pattern;

/*
* Địng nghĩa email :
*   chỉ chứa chữ cái, chữ số và dấu gạch ngang (-)
*   chứa một kí tự @, sau @ là tên miền
*   tên miền có thể là "domain.xxx.yyy" hoặc domain.xxx. Trong đó xxx và yyy là chữ cái và có độ dài từ 2 trở lên
*
* */
public class Test2 {
    public static void main(String[] args) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        String email1 = "minhhoangm1099@gmail.com.vn";
        String email2 = "300799hoang@gmail.com";
        String email3 = "ngoc07/06@gmail.com";
        String email4 = "test3-1@gmail.com";

        System.out.println(email1+":"+ Pattern.matches(EMAIL_PATTERN,email1));
        System.out.println(email2+":"+ Pattern.matches(EMAIL_PATTERN,email2));
        System.out.println(email3+":"+ Pattern.matches(EMAIL_PATTERN,email3));
        System.out.println(email4+":"+ Pattern.matches(EMAIL_PATTERN,email4));

    }
}
