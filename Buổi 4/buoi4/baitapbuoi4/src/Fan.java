
public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan(){

    }
    public void On() {
        on = true;
    }

    public void Off() {
        on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //
    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor(){
        return color;
    }
    public void setColor( String newColor){
        color = newColor;
    }


    @Override
    public String toString() {
        if(on){
            return speed + " " + color+ " "+ radius + " Fan is on";
        } else {
            return color + " " + radius + " Fan is off";
        }
    }

}
