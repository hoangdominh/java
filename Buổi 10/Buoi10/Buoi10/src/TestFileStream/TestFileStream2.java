package TestFileStream;
import java.io.*;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class TestFileStream2 {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp2.dat"));
        ){
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        try (
            DataInputStream input = new DataInputStream(new FileInputStream("temp2.dat"));
        ){
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
        }
    }
}
