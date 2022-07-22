package StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


//  Hàm khởi tạo để tạo biến

    Student(int r, String n){
        rollno = r;
        name = n;
    }

//  Phương thức static để thay đổi giá trị biến static
    static void change() {
        college = "CODEGYM";
    }

//  Phương thức hiện thị giá trị ra màn hình
    void display() {
        System.out.println(rollno + " " + name + " "+ college);
    }

}
