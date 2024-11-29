package File_Object_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        //Ghi dữ liệu
//        list.add(new Student("A", "Nguyen Van Tuyen"));
//        list.add(new Student("B", "Nguyen Van Hoang MeMe"));
//        list.add(new Student("C", "Hoang Phuong Mai"));
//        // Lưu object vào file bước ĐẦU TIÊN là phải có: "implements Serializable" QUAN TRỌNG ĐẦU TIÊN.
//
//        FileOutputStream out = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            out = new FileOutputStream("Student222.dat");
//            objectOutputStream = new ObjectOutputStream(out);
//            objectOutputStream.writeObject(list);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if (objectOutputStream != null) {
//                try {
//                    objectOutputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        // Đọc dữ liệu
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        try {
            in = new FileInputStream("Student222.dat");
            inputStream = new ObjectInputStream(in);
            list = (List<Student>) inputStream.readObject();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Ket qua la: ");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
        // Viết hàm toString để làm hàm hiển thị
        }
    }
