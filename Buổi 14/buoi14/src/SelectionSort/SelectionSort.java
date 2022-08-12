package SelectionSort;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            int minValue = arr[i];
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,3,90,54,23,12};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
