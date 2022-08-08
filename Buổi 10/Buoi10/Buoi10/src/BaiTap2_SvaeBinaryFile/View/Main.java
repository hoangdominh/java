package BaiTap2_SvaeBinaryFile.View;

import BaiTap2_SvaeBinaryFile.Controller.ProductManager;
import BaiTap2_SvaeBinaryFile.Model.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int luachon =0;
        do {
            System.out.println("----------------Menu------------");
            System.out.println("1. Thêm sản phẩm vào danh sách");
            System.out.println("2. In ra danh sách sản phẩm");
            System.out.println("3. Tìm kiếm thông tin sản phẩm theo ID");
            System.out.println("4. Tìm kiếm thông tin sản phẩm theo TÊN SẢN PHẨM");
            System.out.println("5. Ghi file");
            System.out.println("6. Đọc file");
            System.out.println("Nhập lựa chọn mà bạn muốn");
            luachon = scanner.nextInt();
            scanner.nextLine();

            if(luachon==1){
                System.out.println("Nhập mã sản phẩm: "); int maSanPham = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tên sản phẩm:"); String tenSanPham = scanner.nextLine();

                System.out.println("Nhập hãng sản xuất: "); String hangSanXuat = scanner.nextLine();
                System.out.println("Nhập giá: "); double gia = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Nhập mô tả: "); String moTa = scanner.nextLine();
                Product product = new Product(maSanPham,tenSanPham,hangSanXuat,gia,moTa);
                productManager.addSanPham(product);
            }else if(luachon == 2){
                productManager.inSanPham();
            } else if(luachon==3){
                productManager.timKiemThongTinMaSanPham();
//                productRepo.writeToFile("C:\\Users\\admin\\IdeaProjects\\Buoi10\\src\\product.txt",);

            } else if(luachon==4){
                productManager.timKiemThongTinTenSanPham();
            } else if(luachon==5){
                productManager.saveFile();
//                ArrayList<Product> sanPham = new ArrayList<>();
//                sanPham.add(new Product(1, "Bút", "Việt Nam",5000,"Không"));
//                sanPham.add(new Product(2, "Tẩy", "Trung Quốc",3000,"Không"));
//                sanPham.add(new Product(3, "Thước", "Mỹ",2000,"Không"));
//                sanPham.add(new Product(4, "Kéo", "Pháp",4000,"Không"));
//                productRepo.writeToFile("C:\\Users\\admin\\IdeaProjects\\Buoi10\\src\\product.txt",sanPham);


            }
            else if(luachon==6){
//                List<Product> studentDataFromFile = productRepo.readDataFromFile("C:\\Users\\admin\\IdeaProjects\\Buoi10\\src\\product.txt");
//                for (Product student : studentDataFromFile){
//                    System.out.println(student);
//                }
                productManager.readFile();
            }
        } while (luachon !=0);



    }


}
