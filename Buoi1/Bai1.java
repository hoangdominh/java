import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rate = 23000;
        int s = input.nextInt();
        System.out.println(s +" USD = " + rate * s + " VND");
    }
}
