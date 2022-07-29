package BaiTap1;

public class Product {
    private int id;
    private String name;
    private double price;
    private String des;

    public Product(){

    }
    public Product(int id, String name, double price,String des){
        this.id = id;
        this.name = name;
        this.price = price;
        this.des = des;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name= name;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return des;
    }
    public void setDescription(){
        this.des = des;
    }
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", description='" + des + '\'' + '}';
    }
}
