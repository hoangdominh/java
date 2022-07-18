import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Số bạn cần đọc là: ");
        int x = input.nextInt();

        switch (x) {
            case 0 :
                System.out.println("Zero");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Fine");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            case 9 :
                System.out.println("Nine");
                break;
//            default:
//                System.out.println("Out of ability");
        }

        if (10 <= x && x <20) {
            int a = x%10;
            switch (a){
                case 0 :
                    System.out.println("Ten");
                    break;
                case 1 :
                    System.out.println("Eleven");
                    break;
                case 2 :
                    System.out.println("Twelve");
                    break;
                case 3 :
                    System.out.println("Thirteen");
                    break;
                case 4 :
                    System.out.println("Fourteen");
                    break;
                case 5 :
                    System.out.println("Fifteen");
                    break;
                case 6 :
                    System.out.println("Sixteen");
                    break;
                case 7 :
                    System.out.println("Seventeen");
                    break;
                case 8 :
                    System.out.println("Eighteen");
                    break;
                case 9 :
                    System.out.println("Nineteen");
                    break;
            }
        }
        if (20 <= x && x < 100){
            int hangchuc = ((x/10)%10);
            int hangdonvi = x%10;



            switch (hangchuc) {
                case 2 :
                    System.out.print("Twenty ");
                    break;
                case 3 :
                    System.out.print("Thirty ");
                    break;
                case 4 :
                    System.out.print("Forty ");
                    break;
                case 5 :
                    System.out.print("Fifty ");
                    break;
                case 6 :
                    System.out.print("Sixty ");
                    break;
                case 7 :
                    System.out.print("Seventy ");
                    break;
                case 8 :
                    System.out.print("Eighty ");
                    break;
                case 9 :
                    System.out.print("Ninety ");
                    break;
            }

            switch (hangdonvi){
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Fine");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
            }

        }
        if (100<= x && x < 999){
            int tram = x/100;
            int chuc = (x/10)%10;
            int donvi = x%10;

            switch (tram){
                case 1 :
                    System.out.print("One hundred ");
                    break;
                case 2 :
                    System.out.print("Two hundred ");
                    break;
                case 3 :
                    System.out.print("Three hundred ");
                    break;
                case 4 :
                    System.out.print("Four hundred ");
                    break;
                case 5 :
                    System.out.print("Fine hundred ");
                    break;
                case 6 :
                    System.out.print("Six hundred ");
                    break;
                case 7 :
                    System.out.print("Seven hundred ");
                    break;
                case 8 :
                    System.out.print("Eight hundred ");
                    break;
                case 9 :
                    System.out.print("Nine hundred ");
                    break;
            }

            switch (chuc) {
                case 2 :
                    System.out.print("twenty ");
                    break;
                case 3 :
                    System.out.print("thirty ");
                    break;
                case 4 :
                    System.out.print("forty ");
                    break;
                case 5 :
                    System.out.print("fifty ");
                    break;
                case 6 :
                    System.out.print("sixty ");
                    break;
                case 7 :
                    System.out.print("seventy ");
                    break;
                case 8 :
                    System.out.print("eighty ");
                    break;
                case 9 :
                    System.out.print("ninety ");
                    break;
            }
            switch (donvi){
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("fine");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
            }
        }
    }
}

