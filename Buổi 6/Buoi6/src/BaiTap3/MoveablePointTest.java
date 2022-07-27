package BaiTap3;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println();
        Point point = new Point(2.3f,3.4f);
        System.out.println(point);
        System.out.println();
        moveablePoint = new MoveablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(moveablePoint);
        System.out.println();
        moveablePoint = new MoveablePoint(1.1f,2.2f);
        moveablePoint.move();
        System.out.println(moveablePoint.move());

    }
}
