public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


//  Getter các thuộc tính của trường speed

    public int getSlow(){
        return SLOW;
    }
    public int getMedium(){
        return MEDIUM;
    }
    public int getFast(){
        return FAST;
    }

//  Setter các thuộc tính của trường speed

    public void setSLOW(int newSlow){
        SLOW = newSlow;
    }

    public void setMEDIUM(int newMedium){
        MEDIUM = newMedium;
    }
    public void setFAST(int newFast){
        FAST = newFast;
    }
    public void On() {
        on = true;
    }
    public void Off() {
        on = false;
    }
    public void Radius(double newRadius) {
         radius = newRadius;
    }
    public void Color( String newColor){
        color = newColor;
    }

    public Fan(){

    }
    public String toString() {
        if(on){
            return speed + " " + color+ " "+ radius + " Fan is on";
        } else {
            return color + " " + radius + " Fan is off";
        }
    }

}
