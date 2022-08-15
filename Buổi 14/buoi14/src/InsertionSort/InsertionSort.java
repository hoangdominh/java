package InsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,6,77,84,3,7,8,34,5,10,9,23};
        insertionSort(array);
        for (int i=0;i< array.length;i++){
            System.out.print(array[i] +" ");
        }
    }
}
