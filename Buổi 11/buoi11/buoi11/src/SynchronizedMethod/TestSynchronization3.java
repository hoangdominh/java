package SynchronizedMethod;

public class TestSynchronization3 {
    public static void main(String[] args) {
//      Tạo một obj
        final Table3 obj = new Table3();
//      Chúng ta đã tạo ra hai thread bằng lớp ẩn danh
        Thread t5 = new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };

        Thread t6 = new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t5.start();
        t6.start();
    }

}
