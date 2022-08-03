import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();
//      Phương thức add thêm các phần tử vào collection
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);
//      Phương thức contains kiểm tra xem phần tử chứa collection chỉ định hay không
        System.out.println("\nIs Dallas is collection1? "+collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println(collection1);
//      Phương thức size trả về số phần tử trong collection
        System.out.println("\n" +collection1.size()+"cities are in collection1 now");

        Collection collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        ArrayList c1 = (ArrayList) collection1.clone();
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = (ArrayList)(collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList)(collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
