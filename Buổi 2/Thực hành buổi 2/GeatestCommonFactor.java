import java.util.Scanner;

public class GeatestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0||b==0){
            System.out.println("No greatest common factor ");
        }

//      Thuat toan Euclid
        while (a!=b){
            if (a>b){
                a = a-b;
            } else {
                b = b-a;
            }
        }
        System.out.println("Greatest common factor: "+ a);
    }
}
