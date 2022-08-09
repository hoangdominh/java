package BaiThucHanh4;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        ThreadRandom threadRandom = new ThreadRandom(shareData);
        ThreadSquare threadSquare = new ThreadSquare(shareData);

        threadRandom.start();
        threadSquare.start();
    }
}