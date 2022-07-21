import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
//      Phương thức bắt đầu
        stopWatch.start();

//      Chạy thuật toán
        Random random = new Random();
        int n = 100000;
        int [] array;
        array = new int[n];
        for(int i =0; i<n;i++){
            array[i] = random.nextInt();
        }
        SelectionSort(array);
//      Phương thức kết thúc
        stopWatch.stop();

        System.out.println("The running time of Selection sort algorithm is: " + stopWatch.getElapsedTime() + " milisecond");
    }

//      Thuật toán Selection Sort !!!
    public static void SelectionSort(int arr[]){
//      Duyệt các phần tử của mảng
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for( int j =i+1; j< arr.length ; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
//          Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

