package Test2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main start");
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo();
        Thread t = new Thread(threadTwo);
        t.start();
        /* Chạy luồng main start -> Chạy hết luồng threadOne -> Chạy đến luồng main Stop rồi chạy nốt luồng thứ 2*/
        System.out.println("Thực hiện nối luồng 1 vào thread main");
        threadOne.join();
        System.out.println("Thực hiện nối luồng 2 vào thread main");
        t.join();
        System.out.println("Thread main stop");


        /*
//        Phương thức stop() làm chết luồng
        try {
            Thread.sleep(5000);
            threadOne.stop();
            t.stop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */


    }
}
