package DocFileCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocFileCSV {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\hoangdm13\\IdeaProjects\\Buoi9\\Buoi9\\src\\DocFileCSV\\file.csv");
            BufferedReader reader = new BufferedReader(fileReader);
            String line =null;
            while ((line = reader.readLine())!=null){
                String fields[] = line.split(",");
                System.out.println("id: "+fields[0]+" code: "+fields[1]+" name: "+fields[2]);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
