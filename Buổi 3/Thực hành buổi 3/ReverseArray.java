import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner((System.in));
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size >20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

//      Khởi tạo và cấp phát bộ nhớ cho mảng
        array = new int[size];

//      Nhập các phẩn tử cho mảng
        int i =0;
        while (i< array.length){
            System.out.print("Enter element " +(i+1)+ ": ");
            array[i] = scanner.nextInt();
            i++;
        }

//      Hiện thị mảng vừa nhập
        System.out.printf("%-20s%s","Elements in array: ","");
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+"\t");
        }

        for (int j=0;j< array.length/2;j++){
            int temp=array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }

//      Đảo lại ngược các phần tử cho mảng
        System.out.printf("\n%-20s%s","Reverse array: ","");
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+"\t");
        }

    }
}
