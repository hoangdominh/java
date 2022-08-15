package SingleResponsibilityPrinciple;

public class Main implements Test3,Test4{

    @Override
    public void run() {
//        Test4.super.run();
        System.out.println("cccccccccccc");
    }
    public static void main(String[] args) {
        Test3 test3 = new Main() {
        };
        test3.run();
    }
}
