package BaiTap1;

public class Cylinder extends Circle{
    private double hight =1.0;

    public Cylinder(){}

    public Cylinder(double hight){
        this.hight=hight;
    }
    public Cylinder(double hight,double radius,String color){
        super(radius, color);
        this.hight = hight;
    }
    public double getHight(){
        return hight;
    }
    public void setHight(double hight){
        this.hight = hight;
    }
    public double getVolume(){
        return getArea()*hight;
    }
    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * hight;
    }

    @Override
    public String toString() {
        return "A Cylinder with" +
                "height = " + getHight() +
                " radius = " + this.getRadius() +
                " color = " + this.getColor() + '\'' +
                '}' + " which is a subclass of " + super.toString();
    }

}