package ClassFile;

import java.io.File;
import java.io.IOException;

public class VDTaoTapTin_ThuMuc {
    public static void main(String[] args) {

        // Kiểm tra thư mục hoặc tập tin  có tồn tại hay không?
        File folder1 = new File("E:\\JAVA\\JAVA Advance\\src\\Thread_Luong");
        File folder2 = new File("E:\\JAVA\\JAVA Advance\\src\\Thread_Baitap1");
        System.out.println("Kiểm tra folder1 có tồn tại k? " + folder1.exists());
        System.out.println("Kiểm tra folder2 có tồn tại k? " + folder2.exists());

        //Tạo thư mục
        //Phương thức mkdir() -->Tạo ra 1 thư mục
        File d1 = new File("E:\\JAVA\\JAVA Advance\\src\\Thread_Luong\\ThuMuc_Demo");
        d1.mkdir();

        //Phương thức mkdirs() -->Tạo ra nhiều thư mục cùng lúc.
        File d2 = new File("E:\\JAVA\\JAVA Advance\\src\\Thread_Luong\\ThuMuc_Demo\\ThuMuc_Demo1\\ThuMuc_Demo2\\ThuMuc_Demo3\\ThuMuc_Demo4");
        d2.mkdirs();

        //Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls, ...)
        File file1 = new File("E:\\JAVA\\JAVA Advance\\src\\Thread_Luong\\ThuMuc_Demo\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
