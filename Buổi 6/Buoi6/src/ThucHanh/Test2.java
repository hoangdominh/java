package ThucHanh;

// class A thay vì cài đè, nó nạp chồng bằng phương thức p(int number).

public class Test2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.p(10);
        a.p(10.0);
    }
}

    class A1 extends B1 {
//       chú ý tham số truyền vào là int
        public void p(int number) {
            System.out.println(number);
        }
}
    class B1 {
        public void p(double number) {
            System.out.println(number * 2);
        }
}
