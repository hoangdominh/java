import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice =-1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print The Rectangle ");
        System.out.println("2. Print The Square Triangle (botton-left)");
        System.out.println("3. Print The Square Triangle (Top-left)");
        System.out.println("4. Print Isosceles Triangle");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        choice =scanner.nextInt();

        switch (choice){
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập chiều dài: ");
                int x = input.nextInt();
                System.out.println("Nhập chiều rộng: ");
                int y = input.nextInt();

                for (int i=1;i<=x ;i++){
                    for(int j=1;j<=y; j++){
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                Scanner input2 = new Scanner(System.in);
                System.out.println("Nhập chiều cao: ");
                int h = input2.nextInt();

                for (int i=1;i<=h; i++){
                    for (int j=1;j<i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }


                break;
            case 3:
                Scanner input3 = new Scanner(System.in);
                System.out.println("Nhập chiều cao: ");
                int a = input3.nextInt();

                for (int i=a;i>=1; i--){
                    for (int j=1;j<i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }

            case 4 :
                Scanner input4 = new Scanner(System.in);
                int z, k = 0;
                System.out.printf("Nhập vào chiều cao tam giác cân: ");
                z = input4.nextInt();
                for (int i = 1; i <= z; ++i, k = 0) {
                    for (int j = 1; j <= z - i; ++j) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }

                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
