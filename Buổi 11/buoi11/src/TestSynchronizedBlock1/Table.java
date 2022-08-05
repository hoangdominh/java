package TestSynchronizedBlock1;

class Table {
    void printTable(int n) {
//      Khối đồng bộ (synchronized block)
        synchronized (this) {
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
