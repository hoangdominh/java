package TestFileStream;


import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args){
        try {
            try(
                    DataOutputStream output = new DataOutputStream(new FileOutputStream("test.txt"));
            )
            {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);

            }
            try(
                    DataInputStream input = new DataInputStream(new FileInputStream("test.txt"));
            ){
                while (true){
                    System.out.println(input.readDouble());
                }
            }
        }  catch (Exception ex) {
            System.out.println("All data were read");
        }
    }
}
