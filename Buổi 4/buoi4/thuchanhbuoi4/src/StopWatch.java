import java.sql.Timestamp;
import java.util.Date;

public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    public boolean running = false;


    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(long endTime) {
        return endTime;
    }

    public StopWatch(){

    }

    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsedTime =0;
        if (running) {
            elapsedTime = (System.currentTimeMillis() - startTime);
        } else {
            elapsedTime = (endTime - startTime);
        }
        return elapsedTime;
    }
}
