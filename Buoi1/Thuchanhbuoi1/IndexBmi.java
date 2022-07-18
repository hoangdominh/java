import java.util.Scanner;

public class IndexBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao (m): ");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi <25.0) {
            System.out.println("Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
