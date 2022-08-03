public class File {
    public static void main(String[] args) {
//      Tạo một đối tượng File đại diện cho một file đang tồn tại
        java.io.File f = new java.io.File("foo.txt");

//      Tạo một thư mục mới
        java.io.File dir = new java.io.File("Book");
        dir.mkdir();

//      Liệt kê nội dung của một thư mục
        if(dir.isDirectory()){
            String[] dirContenst = dir.list();
//            for (int i =0; i < dirContenst;i++){
//                System.out.println(dirContenst[i]);
//            }
        }


//       Lấy đường dẫn tuyệt đối của file hoặc thư mục
        System.out.println(dir.getAbsolutePath());

//       Xóa file hoặc thư mục (trả về true nếu thành công
        boolean isDeleted = f.delete();
    }
}
