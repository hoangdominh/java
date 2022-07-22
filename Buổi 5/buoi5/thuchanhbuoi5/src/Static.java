class A2{
    static {
        System.out.println("Khoi static duoc trieu hoi");
    }
}

public class Static {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Hoang");
//        s1.change();
        Student s2 = new Student(222,"Minh");
        Student s3 = new Student(333,"Do");
        s1.display();
        s2.display();
        s3.display();
    }
}

class Student{
    int rollno;
    String name;
    static String college ="BachKhoa";
    static void change(){
        college = "QuocGia";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+ " " + name + " " +college);
    }
}

