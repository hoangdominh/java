import java.util.Scanner;

public class PrintTheRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int x = input.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int y = input.nextInt();

        for (int i=1;i<=x ;i++){
            for(int j=1;j<=y; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
