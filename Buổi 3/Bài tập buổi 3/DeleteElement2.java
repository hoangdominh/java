import java.util.Scanner;

public class DeleteElement2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number you want to delete: ");
        int x = scanner.nextInt();
        for (int i=0;i< array.length;i++){
            if (array[i] == x) {
                int k = 0;
                int index_del = i;
//              Duyệt mảng và xóa các phần tử đã chọn cho mảng
                for (k = index_del; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }
//      In ra các phần tử trong mảng
        System.out.printf("New elements in array: ");
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
}
