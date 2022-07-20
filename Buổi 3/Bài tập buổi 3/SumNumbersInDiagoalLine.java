import java.util.Scanner;

public class SumNumbersInDiagoalLine {
    public static void main(String[] args) {
        int width =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = scanner.nextInt();

//      Nhập các giá trị trong mảng
        int[][] array = new int[width][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Enter elements [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
//      In ra mảng vừa nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum =0;
        for(int i=0;i<width;i++) {
            sum = sum + array[i][i];
        }
        System.out.println("Tổng đường chéo là: "+sum);
    }
}
