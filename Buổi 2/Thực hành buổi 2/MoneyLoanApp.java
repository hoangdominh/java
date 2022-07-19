import java.util.Scanner;

//Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
public class MoneyLoanApp {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: "); // Nhập số tiền gửi
        money =input.nextDouble();
        System.out.println("Enter investment months: "); // Nhập số tháng gửi
        month =input.nextInt();
        System.out.println("Enter annual interest rate in percentage: "); // Nhập lãi suất
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i=0; i<month;i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
