package BaiThucHanh4;

import java.util.Random;

public class ThreadRandom extends Thread{
    ShareData shareData;

    public ThreadRandom(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run(){
        Random random = new Random();

        for (int i=0;i<10;i++){
            synchronized (shareData){
                int rad = random.nextInt(100)+1;
                shareData.setRad(rad);
                System.out.println("Rad :"+rad);
//                wait => T2 chay
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        shareData.notifyAll();
    }
}
