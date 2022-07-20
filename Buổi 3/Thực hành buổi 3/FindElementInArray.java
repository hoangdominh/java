import java.util.Scanner;
// Tìm giá trị trong mảng
public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Minh","Hoang","Ninh","Dai","Long","Hieu","Hoa","Cong","Duc","Linh","Luong"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: " );
//       Nhap vao input_name
        String input_name = scanner.nextLine();
        boolean isExits = false;
        for (int i=0;i< students.length;i++){
//          Neu studens[i] = input_name
            if (students[i].equals(input_name)){
                System.out.println(students.length) ;
                System.out.println("Position of the students in the list "+ input_name + " is: "+i);
                isExits = true;
                break;
            }
        }
        if(!isExits) {
            System.out.println("Not found" +input_name+"in the list");
        }
    }
}
