package BubbleSort;

public class BubbleSort {

//    Cách 1 : Duyệt phần tử từ đầu xuống cuối
    public static void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j< array.length;j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] =array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

//    Cách 2 : Duyệt phần tử từ cuối lên
    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,3,90,54,23,12};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("======================");

        int[] arr2 = {5,4,2,1,8};
        bubbleSort2(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
