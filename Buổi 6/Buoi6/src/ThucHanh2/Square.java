package ThucHanh2;

public class Square extends Rectangle{
    //    private double side =1.0;
    public Square(){

    }
    public Square(double side){
        super(side,side);
//        this.side =side;
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHight(side);
    }

    //  Cai de phuong thuc setWidth va setHight
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHight(double hight){
        setHight(hight);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }


}
