package ThucHanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
//    public static void main(String[] args) {
//        Student student1 = new Student("Hoang",23,"Mai Son");
//        Student student2 = new Student("Minh",23,"Na Bo");
//        Student student3 = new Student("Ninh", 23, "Na San");
//
//        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
//        studentMap.put(1,student1);
//        studentMap.put(2,student2);
//        studentMap.put(3,student3);
//        studentMap.put(4,student1);
//
//        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
//        System.out.println("--------------------------SET-------------------------");
//        Set<Student> students = new HashSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student1);
//        for(Student student : students){
//            System.out.println(student.toString());
//        }
//
//    }
    public static void main(String[] args) {
        Student student1 = new Student("Hoang",23,"Mai Son");
        Student student2 = new Student("Hoang", 23,"Mai Son");
        Student student3 = new Student("Ninh", 23, "Na San");
//
        Set<Student> studentMap = new HashSet<Student>();
        studentMap.add(student1);
        studentMap.add(student2);

//        Set<String> studentMap = new HashSet<String>();
//        studentMap.add(String.valueOf(student1));
//        studentMap.add(String.valueOf(student2));

        System.out.println(studentMap);
        System.out.println(studentMap.size());
    }
}
