package Regex;

import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
//        a - z ngoại trừ bc
        System.out.println(Pattern.matches("[a-z&&[^bc]]","a"));
        System.out.println(Pattern.matches("[a-z&&[^bc]]*","bc"));

        System.out.println("======================================================");
//        a - z ngoại trừ  m - p
        System.out.println(Pattern.matches("[[a-z&&[^m-p]]]", "a"));
        System.out.println(Pattern.matches("[[a-z&&[^m-p]]]", "m"));

        System.out.println("======================================================");
//      a,b,c
        System.out.println(Pattern.matches("[abc]","c"));
        System.out.println(Pattern.matches("[abc]","abc"));

        System.out.println("======================================================");
//      0 - 9
        System.out.println(Pattern.matches("[0-9]", "8"));
    }
}
