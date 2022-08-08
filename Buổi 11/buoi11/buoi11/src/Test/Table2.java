package Test;

class Table2 {

//  SỬ DỤNG SYNCHRONIZED METHOD
    synchronized void printTable(int n) { // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("XONG");

    }
}

class MyThread3 extends Thread {
    Table2 t;

    MyThread3(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread4 extends Thread {
    Table2 t;

    MyThread4(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}


