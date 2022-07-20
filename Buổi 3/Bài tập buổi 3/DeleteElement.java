import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array ={1,3,4,5,6,7,8,3};
        Scanner scanner = new Scanner(System.in);
        int z = array.length;
//      In ra các phần tử trong mảng
        System.out.print("Elements in array: ");
        for (int j=0;j< z;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        System.out.print("Enter the element you want to remove: ");
        int x = scanner.nextInt();


//      Tìm X xem có xuất hiện trong mảng hay không
        for (int i=0;i< array.length;i++){
            if (array[i] == x) {
                int k = 0;
                int index_del = i;
//              Duyệt mảng và xóa các phần tử đã chọn cho mảng
                for (k = index_del; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
//                array[array.length-1] =0;
                z--;
            }
        }
//      In ra các phần tử trong mảng
        System.out.printf("New elements in array: ");
        for (int j=0;j< z;j++){
            System.out.print(array[j]+" ");
        }
    }
}
