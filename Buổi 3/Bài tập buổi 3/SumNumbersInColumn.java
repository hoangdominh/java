import java.util.Scanner;

public class SumNumbersInColumn {
    public static void main(String[] args) {
        int row =0;
        int column =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        row = scanner.nextInt();
        System.out.print("Enter the column: ");
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

        int x = 0;
        System.out.print("What column do you want to sum?");
        x = scanner.nextInt();
        if(x < -1 || x > column){
            System.out.println("There is no column you want to delete");
        } else {
            int sum=0;
            for (int i=0;i<row;i++){
                sum =sum + array[i][x-1];
            }
            System.out.println("Sum numbers in a column: "+sum);

        }
    }
}

