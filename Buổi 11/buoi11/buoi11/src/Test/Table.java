package Test;

class Table {
//  KHÔNG SỬ DỤNG SYNCHRONIZED METHOD
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

//            Vấn đề xảy ra khi KHÔNG sử dụng đồng bộ
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}

class Mythread1 extends Thread{
    Table t;

    public Mythread1(Table t) {
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Mythread2 extends Thread{
    Table t;
    Mythread2(Table t){
        this.t =t;
    }
    public void run() {
        t.printTable(100);
    }

}
