package BaiTap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExam {
    public NumberExam() {

    }
    private static final String NUMBER_REGEX = "^\\([0-9]{2}\\)-\\(0\\d{9}\\)";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
