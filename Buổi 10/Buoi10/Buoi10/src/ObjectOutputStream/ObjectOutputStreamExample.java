package ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos =null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1,"Phone",2800000,"New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex){
            ex.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success !");

    }
}
