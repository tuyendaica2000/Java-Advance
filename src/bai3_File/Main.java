package bai3_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Phan 1: File class
        File file = new File("Vidubai3.txt");
        if (file.exists()){
            System.out.println("Đã tồn tại file");
        }
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("File không tồn tại");
        }

        //Phan 2: Ghi du lieu vao file
        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);
        try {

            // Nhập sẵn vào file
            fos = new FileOutputStream("test.txt");
            /*String line = "NGUYEN VAN TUYEN";
            byte[] b = line.getBytes();
            try {
                fos.write(b);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/

            //TH2: Muốn nhập vào từ bàn phím:
            for (;;) {
                System.out.println("Mời bạn nhập nội dung cần thêm:");
                String line = sc.nextLine() + "\n";
                byte[] b = line.getBytes() ;
                fos.write(b) ;

                System.out.println("Bạn có muốn dừng lại không? Y/N:");
                String choose = sc.nextLine();
                if (choose.equalsIgnoreCase("N")){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
