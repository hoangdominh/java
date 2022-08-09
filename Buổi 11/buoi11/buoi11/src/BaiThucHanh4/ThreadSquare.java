package BaiThucHanh4;

public class ThreadSquare extends Thread{
    ShareData shareData;

    public ThreadSquare(ShareData shareData) {
        this.shareData = shareData;
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            synchronized (shareData){
                try {
                    shareData.notifyAll();
                    shareData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int rad = shareData.getRad();
                rad*=rad;
                System.out.println("PT : "+rad);
            }
        }
    }
}
