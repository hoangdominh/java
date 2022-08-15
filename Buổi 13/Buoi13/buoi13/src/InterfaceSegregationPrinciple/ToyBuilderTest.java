package InterfaceSegregationPrinciple;

public class ToyBuilderTest {
    public static void main(String[] args) throws Exception {
        testBuildToyHouse();
        testBuildToyCar();
        testBuildToyPlane();

    }

    public static void testBuildToyHouse() throws Exception {

        ToyHouse toyHouse = ToyBuilder.buildToyHouse();

        System.out.println(toyHouse);
    }


    public static void testBuildToyCar() throws Exception {

        ToyCar toyCar=ToyBuilder.buildToyCar();;

        System.out.println(toyCar);

    }

    public static void testBuildToyPlane() throws Exception {

        ToyPlane toyPlane=ToyBuilder.buildToyPlane();

        System.out.println(toyPlane);

    }

}


