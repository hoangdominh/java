package Test2;

public class ThreadTwo implements Runnable{
//    Khởi tạo phương thức khởi tạo để nối 2 luồng với nhau
    ThreadOne t1;
    public ThreadTwo() {
    }

    public ThreadTwo(ThreadOne t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("t2 is running");
        try {
            System.out.println("nối t1 vào t2");
            t1.join();
            System.out.println("t1 kết thúc chạy");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0;i<10;i++){
            System.out.println("ThreadTwo >"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
