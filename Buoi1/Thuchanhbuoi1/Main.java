import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.5f;
        double d = 20.5d;
        boolean b = true;
        char c = 'a';
        String s = "Ha Noi";


        float width;
        float height;

        System.out.println("Linear Equation Resoloer");
        System.out.println("Given a equation as 'a*x + b = c',please enter constants: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        double x = scanner.nextDouble();
        System.out.println("y: ");
        double y = scanner.nextDouble();
        System.out.println("z: ");
        double z = scanner.nextDouble();
        if (x !=0){
            double answer = (z-y) /x;
            System.out.printf("Equation pass with x = %f!\n",answer);
        }  else {
            if(y == z) {
                System.out.print("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }


        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);

        System.out.println("--------");
        System.out.println("i = " +i);
        System.out.println("f = " +f);
        System.out.println("d = " +d);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("s = " +s);


    }
}
