package Test;

public class TestSynchronization2 {
    public static void main(String args[]) {
        Table2 obj = new Table2();

        MyThread3 t3 = new MyThread3(obj);
        MyThread4 t4 = new MyThread4(obj);

        t3.start();
        t4.start();

    }

}
