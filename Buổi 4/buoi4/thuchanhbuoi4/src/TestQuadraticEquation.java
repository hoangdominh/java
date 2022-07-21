import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a,b,c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if ( a == 0){
            System.out.println("the equation has a unique solution: "+(-c/b));
        } else {
            if (quadraticEquation.getDiscriminant() < 0){
                System.out.println("The equation has no roots");
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("the equation has a unique solution: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("the equation has two solutions: "+ quadraticEquation.getRoot1() + " , " + quadraticEquation.getRoot2() );
            }
        }
    }
}
