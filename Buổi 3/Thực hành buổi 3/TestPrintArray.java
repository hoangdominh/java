public class TestPrintArray {
    public static void main(String[] args) {
        printArray(new int[]{2,4,6,2,1,5,8,9});
    }
    public static void printArray(int[] array){
        for (int i =0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
