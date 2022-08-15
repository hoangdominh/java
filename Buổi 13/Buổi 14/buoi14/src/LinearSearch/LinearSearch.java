package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int n){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1,2,5,67,7,8,9,30,1999};
        System.out.println("Nhap so ban muon tim: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = linearSearch(array,n);

        if (result ==-1){
            System.out.println(n+" khong co trong array");
        } else{
            System.out.println(n+" o vi tri "+result+ " trong mang");

        }

    }
}
