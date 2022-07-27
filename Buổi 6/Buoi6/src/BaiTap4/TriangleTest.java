package BaiTap4;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Input 3 side of triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        triangle.setSide1(a);
        triangle.setSide2(b);
        triangle.setSide3(c);

        triangle = new Triangle(a,b,c);
        System.out.println(triangle);

        System.out.println();
        triangle = new Triangle(a,b,c,"red",true);
        System.out.println(triangle);
    }
}
