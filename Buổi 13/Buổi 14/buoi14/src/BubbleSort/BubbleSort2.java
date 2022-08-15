package BubbleSort;

public class BubbleSort2 {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void bubbleSort2(int[] list) {

        for (int i=0;i<list.length-1;i++){
            boolean needNextPass = false;
            for (int j=i+1;j< list.length;j++){
                if(list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] =list[j-1];
                    list[j-1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass ==false){
                break;
            }
        }
    }


    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================");

        bubbleSort2(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
