import java.util.Scanner;

public class FindElementIn2DArray {
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
//      In ra giá trị lớn nhất trong mảng
        int max = array[0][0];
        for (int i=0; i<row;i++){
            for (int j =0;j<column;j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: "+max);

    }
}
