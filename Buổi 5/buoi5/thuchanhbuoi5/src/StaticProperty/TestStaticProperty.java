package StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 2");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Minh Hoang","3007");
        System.out.println(Car.numberOfCars);

    }
}
