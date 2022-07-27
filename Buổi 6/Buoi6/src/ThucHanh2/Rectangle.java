package ThucHanh2;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double hight = 1.0;

    public Rectangle(){

    }
    public Rectangle(double hight,double width){
        this.hight=hight;
        this.width=width;
    }
    public Rectangle(double hight,double width,String color, boolean filled){
        super(color, filled);
        this.hight = hight;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    public double getHight(){
        return hight;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHight(double hight){
        this.hight = hight;
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "+getWidth()+
                " and length = " +getHight()+
                " ,which is a subclass of " +super.toString();
    }
}
