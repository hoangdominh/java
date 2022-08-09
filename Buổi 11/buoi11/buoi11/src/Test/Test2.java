package Test;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Thread 1 > "+i);
                }
            }
        });
        t.start();

//        Cách tạo luồng
//        Cách 1:
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Thread 2 > "+i);
                }
            }
        });
        t2.start();

        System.out.println("Ends");
    }
}
