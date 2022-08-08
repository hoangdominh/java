package BaiTap2_SvaeBinaryFile.Controller;


import BaiTap2_SvaeBinaryFile.Model.Product;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductManager {
    public List<Product> productList;
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        this.productList = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> productList) {
        this.productList = new ArrayList<Product>();
    }

    //    Thêm sản phẩm
    public void addSanPham(Product product){
        this.productList.add(product);
    }

    //    In ra sản phẩm
    public void inSanPham(){
        for (Product product : productList){
            System.out.println(product);
        }
    }

    //   Tìm kiếm thông tin sản phẩm theo mã sản phẩm
    public void timKiemThongTinMaSanPham(){
        System.out.println("Nhập mã sản phẩm mà bạn muốn tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product o : productList){
            if (o.getMaSanPham()==id){
                System.out.println(o);
                break;
            }
        }
    }

//    Tìm kiếm thông tin sản phẩm theo tên sản phẩm

    public void timKiemThongTinTenSanPham(){
        System.out.println("Nhập tên sản phẩm mà bạn muốn tìm: ");
        String name = scanner.nextLine();
        for (Product o : productList){
            if (o.getTenSanPham().toUpperCase(Locale.ROOT).equals(name.toUpperCase(Locale.ROOT))){
                System.out.println(o);
                break;
            }
        }
    }

    public void saveFile() throws IOException {
        System.out.println("Bắt đầu lưu!");
        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("C:\\Users\\hoangdm13\\IdeaProjects\\Buoi10\\Buoi10\\src\\BaiTap2_SvaeBinaryFile\\product.txt");
            for(Product product: productList){
                String line = product.getFileLine();
//                Chuyen String to Byte
                byte[] b =line.getBytes(StandardCharsets.UTF_8);
//                Lưu
                fos.write(b);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (fos!=null){
                fos.close();
            }
        }
    }

    public void readFile() throws IOException {
        FileInputStream fis =null;
        InputStreamReader reader =null;
        BufferedReader bufferedReader =null;
        try {
            fis = new FileInputStream("C:\\Users\\hoangdm13\\IdeaProjects\\Buoi10\\Buoi10\\src\\BaiTap2_SvaeBinaryFile\\product.txt");
            reader = new InputStreamReader(fis,StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);

            String line = null;
            while ((line = bufferedReader.readLine()) !=null){
                if (line.isEmpty()){
                    continue;
                }
                Product product = new Product();
                product.parse(line);
                productList.add(product);
                for (Product product1 : productList){
                    System.out.println(product1);
                }
            }

        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            if (fis !=null){
                fis.close();
            }
            if (reader != null){
                reader.close();
            }
            if (bufferedReader != null){
                bufferedReader.close();
            }
        }

    }



}
