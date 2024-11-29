package bai3_File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A", "Ha Noi"));
        studentList.add(new Student("B", "Ho Chi Minh"));
        studentList.add(new Student("C", "Da Nang"));
        // ? Muốn lưu chữ toàn bộ thông tin vào trong file thì làm thế nào?

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("student.txt");
            String line = Student.getFileHeaderFormat();
            byte[] b = line.getBytes();

            fos.write(b);
            for (Student std : studentList) {
                line = std.getFileLineFormat();
                b = line.getBytes();

                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
