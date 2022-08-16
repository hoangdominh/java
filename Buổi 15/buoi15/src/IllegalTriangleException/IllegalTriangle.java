package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập cạnh y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập cạnh z: ");
        int z = scanner.nextInt();
        IllegalTriangle illegalTriangle = new IllegalTriangle();
        illegalTriangle.conditionTriangle(x,y,z);
    }

    boolean conditionTriangle(int a, int b , int c) throws Exception {
        if(b <=0||a<=0||c<=0) {
            throw new Exception("3 cạnh KHÔNG phải là cạnh của tam giác");
        } else if (a+b<c || a+c<b || b+c<a) {
            throw new Exception("3 cạnh KHÔNG phải là cạnh của tam giác");
        } else {
            System.out.println("3 cạnh là 3 cạnh của tam giác ");
            return true;
        }
    }

}
