package BaiTap1;

public class NumberGenerator implements Runnable {
    public NumberGenerator() {
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i);
            System.out.println(this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
