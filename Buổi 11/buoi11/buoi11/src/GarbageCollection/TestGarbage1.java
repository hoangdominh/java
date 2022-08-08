package GarbageCollection;

public class TestGarbage1 {
    public void finalize(){
        System.out.println("Object is grabage collected");
    }

    public static void main(String[] args) {
        TestGarbage1 testGarbage1 = new TestGarbage1();
        TestGarbage1 testGarbage2 = new TestGarbage1();
        testGarbage1 = null;
        testGarbage2 = null;
        System.gc();
    }
}
