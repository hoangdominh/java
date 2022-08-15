package BaiTap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter "+array.length+ " values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(array);
    }

    public static void insertionSortByStep(int[] array){
        int pos, x;
        boolean needNextPass;
        for(int i = 1; i < array.length; i++){
            //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                // đổi chỗ
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }

    }
}
