import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

//      Khởi tạo 1 đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width,height);


//      Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiện thị các thông số

        System.out.println("Your Rectangle: \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }
}
