package MainThread;

public class Main extends Thread{
    public static void main(String[] args) {
//      Khai báo một đối tượng t them chiếu đến thread hiện tại (Main Thread)
        Thread t = Thread.currentThread();

//        Lấy ra tên Main Thread
        System.out.println("Thread hiện tại: "+t.getName());

//        Đổi tên Main Thread sang Minh Hoàng
        t.setName("Minh Hoàng");
        System.out.println("Thread hiện tại: "+t.getName());

//        Lấy ra độ ưu tiên của Main Thread
        System.out.println("Độ ưu tiên của Main Thread: "+t.getPriority());

//        Cài đặt độ ưu tiên cho Main thread (tối đa là 10)
        t.setPriority(MAX_PRIORITY);
        System.out.println("Độ ưu tiên mới của Main Thread: "+t.getPriority());

        for (int i=0;i<5;i++){
            System.out.println("Main Thread");
        }

//        Main Thread tạo ra một thread con
        ChildThread childThread = new ChildThread();

//        Cài đặt độ ưu tiên cho thread con (được kế thừa độ ưu tiên từ thread tạo ra nó => 10)
        System.out.println("Độ ưu tiên của Child Thread: " +childThread.getPriority());

//        Cài đặt độ ưu tiên cho thread con (nhỏ nhất là 1)
        childThread.setPriority(MIN_PRIORITY);
        System.out.println("Độ ưu tiên mới của Child Thread: "+childThread.getPriority());

        childThread.start();
    }
}

class ChildThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child thread");
        }
    }
}

