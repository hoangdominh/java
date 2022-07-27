package ThucHanh2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5, 10 );
        System.out.println(rectangle);

        rectangle = new Rectangle(5,10, "red", false);
        System.out.println(rectangle);
    }
}
