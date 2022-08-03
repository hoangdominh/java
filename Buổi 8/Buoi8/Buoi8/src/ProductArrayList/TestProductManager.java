package ProductArrayList;

import ProductArrayList.Product;
import ProductArrayList.ProductManager;

public class TestProductManager {
    public static void printProducts(ProductManager list){
        list.printList();
    }
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,100,"q","mau do"));
        productManager.add(new Product(2,200,"b","mau xanh "));
        productManager.add(new Product(3,300,"c","mau vang"));
        printProducts(productManager);

//      Thêm sản phẩm
        System.out.println("Thêm sản phẩm: ");
        productManager.add(new Product(4, 4, "d","mau tim"));

//      Xóa sản phẩm theo id
        System.out.println("Xóa sản phẩm theo id: ");
        productManager.removeProdById(1);
        printProducts(productManager);

//      Sửa sản phẩm theo id
        System.out.println("Sửa sản phẩm theo id: ");
        productManager.repairProdById(2,"aaaa","màu đỏ");
        printProducts(productManager);

//       Sắp xếp sản phẩm tăng dần theo giá
        System.out.println("Sắp xếp theo thứ tự tăng dần của giá");
        productManager.sortProductAscending();
        printProducts(productManager);

//       Sắp xếp sản phẩm giảm dần theo giá
        System.out.println("Sắp xếp theo thứ tự giảm dần của giá");
        productManager.sortProductDescending();
        printProducts(productManager);
    }
}
