import java.util.Scanner;

public class PrintTheSquareTriangle_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        int x = input.nextInt();

        for (int i=x;i>=1; i--){
            for (int j=1;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
