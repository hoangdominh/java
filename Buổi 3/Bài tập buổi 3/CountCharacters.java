import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String chuoi;
        char kytu = 'h';
        char kytu2 = ' ';
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        chuoi = scanner.nextLine();
        System.out.print("Enter characters: ");
        kytu2 = scanner.next().charAt(0);

        for (int i=0; i<chuoi.length();i++){
            if (chuoi.charAt(i) == kytu2) {
                count++;
            }
        }
        System.out.println("Character count "+kytu2+" appear in the string is: "+count);
    }
}
