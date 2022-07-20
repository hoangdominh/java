public class Array {
    public static void main(String[] args) {
        int[] sourceArray = {1,2,3,4,5,10};
        int[] targetArray = new int[sourceArray.length];
        for (int i=0;i<sourceArray.length;i++){
            targetArray[i] = sourceArray[i];
        }
        System.out.println(targetArray[0]);

        System.out.println("Hello");
    }
}