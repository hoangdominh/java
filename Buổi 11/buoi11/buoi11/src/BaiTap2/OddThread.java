package BaiTap2;

public class OddThread extends Thread {
    public OddThread() {
    }
    public void run(){
        for (int i=0;i<=10;i++){
            if (i%2!=0){
                System.out.println(i);
                try {
                    Thread.sleep(10);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
