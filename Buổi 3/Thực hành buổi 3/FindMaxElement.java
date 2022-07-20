import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size = 0;
        int[] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while ( size > 20);

        array = new int[size];
        int i =0;
//      Nhập giá trị cho các phần tử của mảng
        while (i< array.length){
            System.out.print("Enter element "+(i+1)+ " : " );
            array[i] = scanner.nextInt();
            i++;
        }
//      In ra danh sách các phần tử của mảng
        System.out.print("Property list: ");
        for (int j=0;j< array.length;j++){
            System.out.println(array[j]+"\t");
        }
//      Duyệt các phần tử trong mảng đề tìm ra giá trị lớn nhất và vị trí của nó
        int max = array[0];
        int index = 1;
        for (int j=0; j<array.length;j++){
            if(array[j]>max) {
                max = array[j];
                index = j +1;
            }
        }
//      In ra giá trị lớn nhất trong mảng và vị trí của nó
        System.out.println("The largest property value in the list is "+max+" ,at position "+ index);
    }
}



