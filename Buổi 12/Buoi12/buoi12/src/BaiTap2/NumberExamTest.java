package BaiTap2;

public class NumberExamTest {
    private static BaiTap2.NumberExam numberExam;
    public static final String[] validNumber = new String[] { "(84)-(0978489648)","(84)-(0373071999)"};
    public static final String[] invalidNumber = new String[] { "(a4)-(0978489648)","(84)-(097889648)" };

    public static void main(String[] args) {
        numberExam = new BaiTap2.NumberExam();
        for(String obj : validNumber){
            boolean isvalid = numberExam.validate(obj);
            System.out.println("Class is "+obj+" is valid: "+isvalid);
        }
        System.out.println("==============================================");
        for(String obj : invalidNumber){
            boolean isvalid = numberExam.validate(obj);
            System.out.println("Class is "+obj+" is valid: "+isvalid);
        }
    }
}
