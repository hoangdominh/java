package BaiThucHanh2;

import java.util.Random;

import static BaiThucHanh2.Main.DISTANCE;
import static BaiThucHanh2.Main.STEP;

public class Car implements Runnable {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        Khởi tạo điểm start(hay km ban đầu)
        int runDistance =0;
//        Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
//        Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE){

            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log ="";
                int percentTravel = (runDistance*100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
