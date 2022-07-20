import java.util.Scanner;

public class FindMinElementInArray {
    public static void main(String[] args) {
        int size=0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = scanner.nextInt();
        array = new int[size];

//      Nhập giá trị cho các phần tử của mảng
        int i =0;
        while (i< array.length){
            System.out.print("Enter element "+(i+1)+ " : " );
            array[i] = scanner.nextInt();
            i++;
        }

//      In ra danh sách các phần tử của mảng
        System.out.printf("%-20s%s","Elements in array: ","");
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        int min = array[0];
        for (int k=0; k<array.length;k++){
            if(array[k]<min) {
                min = array[k];
            }
        }
        System.out.println("The smallest property value in the list is: "+min);
    }
}
