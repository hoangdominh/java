public class TestFrog {
    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("from static "+Frog.getCount());

        new TestFrog().go();
        Frog f = new Frog();
        System.out.println("Use ref var "+f.getCount());
    }
    void go(){
        System.out.println("from inst "+Frog.getCount());
    }
}
class Frog{
    private static int frogCount = 0;
    static int getCount(){
        return frogCount;
    }
    public Frog(){
        frogCount +=1;
    }
}