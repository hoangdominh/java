import java.util.Scanner;

public class PrintIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, k = 0;
        System.out.printf("Nhập vào chiều cao tam giác cân: ");
        x = input.nextInt();
        for (int i = 1; i <= x; ++i, k = 0) {
            for (int j = 1; j <= x - i; ++j) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}

