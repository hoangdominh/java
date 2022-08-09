package BaiTap1;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Main {
    public static void main(String[] args) {
        NumberGenerator obj1 = new NumberGenerator();
        NumberGenerator obj2 = new NumberGenerator();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.setPriority(MIN_PRIORITY);
        System.out.println("Độ ưu tiên của thread1 : "+ thread1.getPriority());


        thread2.setPriority(MAX_PRIORITY);
        System.out.println("Độ ưu tiên mới của Thread2: "+ thread2.getPriority());


        thread1.start();
        thread2.start();
    }
}
