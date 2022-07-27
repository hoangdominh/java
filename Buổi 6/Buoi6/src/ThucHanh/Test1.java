package ThucHanh;

// Class A cài đè phương thức p(double number) của lớp cha

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}
    class A extends B{
        public void p(double number){
            System.out.println(number);
        }
}
    class B{
        public void p(double number){
            System.out.println(number*2);
        }
}
