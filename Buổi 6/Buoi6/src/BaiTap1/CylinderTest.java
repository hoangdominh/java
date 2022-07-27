package BaiTap1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println();
        cylinder = new Cylinder(3);
        System.out.println(cylinder);
        System.out.println("The Area is: "+cylinder.getArea());
        System.out.println("The Volume is: "+cylinder.getVolume());
        System.out.println();
        cylinder = new Cylinder(3,5,"Red");
        System.out.println(cylinder);
        System.out.println("The Area is: "+cylinder.getArea());
        System.out.println("The Volume is: "+cylinder.getVolume());
    }
}
