package ProductLinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager {
    LinkedList<Product> products = new LinkedList<Product>();

    //  Duyệt các sản phẩm trong List
    public void printList(){
        for (Product i : products){
            System.out.println(i);
        }
    }

    //  Thêm sản phẩm
    public LinkedList<Product> add(Product prod){
        products.add(prod);
        return products;
    }


    //  Sửa thông tin sản phẩm theo id
    public void repairProdById(int id, String name,String des){
        for (Product i : products ){
            if(i.getId() == id){
                i.setDes(des);
                i.setName(name);
            }
        }
    }

    //  Xóa sản phẩm theo id
    public void removeProdById(int id){
        int num = 0;
        for (int i =0; i<products.size();i++){
            if(products.get(i).getId() == id){
                num = i;
            }
        }
        products.remove(num);
    }
    //  Sắp xếp sản phẩm
    public void sortProductAscending(){
        Collections.sort(products , new SortProductByPrice());

    }

    public void sortProductDescending(){
        Comparator priceComparator = Collections.reverseOrder(new SortProductByPrice());
        Collections.sort(products, priceComparator);
    }
}
