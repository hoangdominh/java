public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.On();
        fan1.setFAST(3);
        fan1.Radius(10);
        fan1.Color("yellow");

        Fan fan2 = new Fan();
        fan2.Off();
        fan2.setMEDIUM(2);
        fan2.Radius(5);
        fan2.Color("blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
