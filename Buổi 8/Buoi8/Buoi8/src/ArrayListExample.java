import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Java");
        listString.add("C++");
        listString.add("PHP");
        listString.add("Java");

        System.out.println("Các phần tử có trong list là: ");
        System.out.println(listString);

//      Duyet cac phan tu List dung for-each
        for(String ele : listString){
            System.out.println(ele);
        }
        System.out.println("-----------------------------------------------");
//      Duyet cac phan tu List dung Iterator
        Iterator<String> iterator = listString.iterator();
        int count= 0;
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Java")){
                listString.remove(count);

            }
            count++;
        }
        System.out.println(listString);

//      Truy cập các giá trị của phần tử ArrayList
//        System.out.println("List truoc khi cap nhat: ");
//        System.out.println(listString);
//        listString.set(3,"Python");
//        listString.remove("Java");
//        System.out.println("List sau khi cap nhat: ");
//        System.out.println(listString);
    }
}
