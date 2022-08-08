package Test;

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);

        t1.start();
        t2.start();
    }
}
