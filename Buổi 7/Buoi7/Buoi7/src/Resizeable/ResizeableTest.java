package Resizeable;

public class ResizeableTest {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(5,6);

        System.out.println("Pre-resize");
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        for (Shape i : shapes){
            i.resize(Math.random()*100 +1);
        }

        System.out.println("After-resize");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}