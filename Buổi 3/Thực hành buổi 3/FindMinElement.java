public class FindMinElement {
    public static void main(String[] args) {
        int[] arr={4,15,7,8,9,345,1};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " +arr[index]);
    }
//  Phương thức tìm ra giá trị nhỏ nhất
    public static int minValue(int[] array){
        int index = 0;
        for (int i=1;i<array.length;i++){
            if (array[i]< array[index]){
                index = i;
            }
        }
        return index;
    }
}
