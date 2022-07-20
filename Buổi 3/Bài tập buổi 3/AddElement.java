import java.net.BindException;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number you want to insert: ");
        int x = scanner.nextInt();
        System.out.print("Enter position you want to insert: ");
        int y = scanner.nextInt();

        if(y < -1 || y >= array.length-1){
            System.out.println("Unable to insert element into array!");
        } else {
            for (int i=9;i > y; i--){
                array[i] = array[i-1];
            }
            array[y]=x;
        }

//      In ra các giá trị trong mảng
        System.out.print("Elements in array: ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
}
