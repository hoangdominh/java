public class QuadraticEquation {
    private double a, b, c =0;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant() {
        double delta = b*b - 4*a*c;
        return  delta;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            double r1 = (-b + Math.pow(getDiscriminant(),0.5)) / (2*a);
            return r1;
        }else{
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            double r2 = (-b - Math.pow(getDiscriminant(),0.5)) / (2*a);
            return r2;
        } else {
            return 0;
        }
    }
}
