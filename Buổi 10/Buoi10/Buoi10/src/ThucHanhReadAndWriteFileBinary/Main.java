package ThucHanhReadAndWriteFileBinary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  List<Student> readToFile(String path){
        List<Student> students = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Đỗ Minh Hoàng","Cầu Giấy"));
        students.add(new Student(2,"Nguyễn Văn Ninh","Nguyễn Chí Thanh"));
        students.add(new Student(3,"Lê Đức Minh","Nà Sản"));
        students.add(new Student(4,"Vũ Ngọc Hóa","Bình Liêu"));

        writeToFile("Students.txt",students);
        List<Student> studentDataFromfile = readToFile("Students.txt");
        for (Student student :studentDataFromfile){
            System.out.println(student);
        }
    }
}
