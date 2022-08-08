package TestSynchronizedBlock2;

public class TestSynchronizedBlock2 {
    public static void main(String[] args) {
        //  Tạo object duy nhất
        final Table obj = new Table();
        Thread o1 = new Thread(){
            public void run(){
                obj.printTable(4);
            }
        };
        Thread o2 = new Thread(){
            public void run(){
                obj.printTable(60);
            }
        };
        o1.start();
        o2.start();
    }
}
