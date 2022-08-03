package ProductArrayList;

public class Product {
    private int id;
    private double price;
    private String name;
    private String des;

    public Product(){

    }
    public Product(int id, double price, String name, String des){
        this.id=id;
        this.price = price;
        this.name = name;
        this.des = des;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDes(){
        return des;
    }
    public void setDes(String des){
        this.des= des;
    }
    public String toString(){
        return "Sản phẩm có : id = " +id+",name = "+name+",price = "+price+",des = " + des;
    }
}
