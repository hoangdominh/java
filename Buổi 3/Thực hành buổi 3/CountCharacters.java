import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String chuoi;
        char kytu = 'h';
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        chuoi = scanner.nextLine();

        for (int i=0; i<chuoi.length();i++){
            if (chuoi.charAt(i) == kytu) {
                count++;
            }
        }
        System.out.println("Character count "+kytu+" appear in the string is: "+count);
    }
}
