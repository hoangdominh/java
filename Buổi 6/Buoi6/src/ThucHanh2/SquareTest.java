package ThucHanh2;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3);
        System.out.println(square);

        square = new Square(30.7,"blue",true);
        System.out.println(square);
    }
}