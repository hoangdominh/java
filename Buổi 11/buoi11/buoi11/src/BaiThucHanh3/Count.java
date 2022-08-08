package BaiThucHanh3;

public class Count implements Runnable{
    private Thread myThead;
    public Count(){
        myThead = new Thread(this,"my runnable thread");
        System.out.println("My thread created"+myThead);
        myThead.start();
    }

    public Thread getMyThread(){
        return myThead;
    }
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Printing the count"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("My Theard interrupted");
        }
        System.out.println("My Theard run is over");
    }
}
