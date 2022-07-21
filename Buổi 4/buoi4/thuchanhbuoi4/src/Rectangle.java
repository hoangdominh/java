import java.util.Scanner;

public class Rectangle {
//  Khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors)

    double width, height; /* Data Field*/

    //Constructor
    public Rectangle(){
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;    }

//  Định nghĩa các phương thức (method)
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width= " + width + ",height= "+height+"}";
    }
}
