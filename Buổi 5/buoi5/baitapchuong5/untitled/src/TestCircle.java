public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(3.0);

        System.out.println(circle1.getArea());
        System.out.println(circle.getArea());

    }
}