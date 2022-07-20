import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner((System.in));
//      size mảng 1
        System.out.print("Enter a size1: ");
        size1 = scanner.nextInt();
        array1 = new int[size1];

//      Nhập các phần tử trong mảng 1
        int i =0;
        System.out.println("Elements in array 1");
        while (i< array1.length){
            System.out.print("Enter element " +(i+1)+ ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
//      size mảng 2
        System.out.print("Enter a size2: ");
        size2 = scanner.nextInt();
        array2 = new int[size2];
//      Nhập các phần tử trong mảng 2
        int j =0;
        System.out.println("Elements in array 2");
        while (j< array2.length){
            System.out.print("Enter element " +(j+1)+ ": ");
            array2[j] = scanner.nextInt();
            j++;
        }

//      size mảng 3
        int length = array1.length + array2.length;
        int[] array3 = new int[length];

        int h = 0;
        for (int k : array1) {
            array3[h] =  k;
            h++;
        }
        for (int k : array2) {
            array3[h] =  k;
            h++;
        }

//      In ra các phần tử trong mảng 3
        System.out.printf("%-20s%s","New array after merge array: ","");
        for (int n=0;n< array3.length;n++){
            System.out.print(array3[n]+" ");
        }
    }
}
