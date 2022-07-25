public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }
    public Circle( double radius){
        this.radius = radius;
    }
//  Access Modifier

//  Public access modifier
    /*
    public double getRadius(){
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }
    */


//  Protected access modifier
    /*
    protected double getRadius(){
    return radius;
}
    protected double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }
     */
//  Private access modifier
    /*
    private double getRadius(){
        return radius;
    }
    private double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }
    */


    //  Default access modifier
    double getRadius(){
        return radius;
    }
    double getArea() {
        return Math.PI * Math.pow(this.getRadius(),2);
    }
}
