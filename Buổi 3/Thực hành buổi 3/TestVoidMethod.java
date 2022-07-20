
// Phương trhuwsc printGrade là một void method bởi nó không trả về bất cứ giá trị nào

public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.println("The grade is ");
        printGrade(70.5);
        System.out.println("The grade is ");
        printGrade(90.0);
    }
    public static void printGrade(double score){
//        if ( score<0 || score >100){
//            System.out.println("Invalid score");
//            return;
//        }
        if(score >=90.0){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score >=70){
            System.out.println("C");
        } else if (score >=60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
