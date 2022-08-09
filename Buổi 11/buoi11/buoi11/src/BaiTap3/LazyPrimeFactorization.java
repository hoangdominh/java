package BaiTap3;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for(int i = 2; i < n ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
