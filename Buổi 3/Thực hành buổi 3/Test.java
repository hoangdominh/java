import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int row =0;
        int column = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        row =  scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        column = scanner.nextInt();

//      Nhập các giá trị trong mảng
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

//      In ra mảng vừa nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
