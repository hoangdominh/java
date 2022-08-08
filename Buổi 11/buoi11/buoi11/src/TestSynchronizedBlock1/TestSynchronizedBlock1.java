package TestSynchronizedBlock1;

public class TestSynchronizedBlock1 {

    public static void main(String args[]) {

        Table obj = new Table();// tao object duy nhat
        MyThread1 t1 = new MyThread1(obj);

        MyThread2 t2 = new MyThread2(obj);
        t1.start();

        t2.start();
    }
}
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(6);
    }
}


class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(50);
    }
}



