public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.On();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.Off();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

