package Test2;

public class Main1 {
    public static void main(String[] args) {
//        Nối 2 luồng t1,t2 với nhau
        System.out.println("Thread main start");
        ThreadOne t1 = new ThreadOne();
        Thread t2 = new Thread(new ThreadTwo(t1));

        t1.start();
        t2.start();

    }
}
