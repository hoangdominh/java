package BaiTap1;


public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] { "A0318G", "C0318G", "P0318G"};
    public static final String[] invalidClass = new String[] { "D0318G", "M0318G", "P0323A" };

    public static void main(String[] args) {
        classExample = new ClassExample();
        for(String obj : validClass){
            boolean isvalid = classExample.validate(obj);
            System.out.println("Class is "+obj+" is valid: "+isvalid);
        }
        System.out.println("==============================================");
        for(String obj : invalidClass){
            boolean isvalid = classExample.validate(obj);
            System.out.println("Class is "+obj+" is valid: "+isvalid);
        }
    }
}
