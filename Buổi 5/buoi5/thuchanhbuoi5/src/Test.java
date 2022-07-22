public class Test {
        int count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra

        Test() {
            count++;
            System.out.println(count);
        }
        public int A(){
            return count++;
        }

        public static void main(String args[]) {

            Test c1 = new Test();
            Test c2 = new Test();
            Test c3 = new Test();

        }
}
