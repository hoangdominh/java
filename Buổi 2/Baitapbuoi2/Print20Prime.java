// Hiện thị 20 số nguyên tố đầu tiên

import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int numbers = input.nextInt();
        System.out.printf("%d so nguyen to dau tien: ", numbers);
        int count =0;
        int N=2;
        while (count < numbers){
            if(Check(N)){
                System.out.print( N + " ");
                count++;
            }
            N++;
        }

    }
    public static boolean Check(int numbers) {
        boolean check = true;
        if (numbers < 2) {
            check = false;
        } else {
            int i =2;
            while(i<numbers){
                if (numbers%i ==0){
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
