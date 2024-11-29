package JavaCore_Advance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
* Viết 1 chương trình chạy real-time, ghi các số nguyên random ra file output.txt .
* Dừng chương trình khi gõ lệnh stop trên cửa sổ chương trình
* */

public class Bai1_JAVACORE {
    public static void main(String[] args) {
        final boolean[] running = {true};
        Random random = new Random();

        //Tạo 1 luồng mới đọc lệnh từ bàn phím
        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);

            // Vòng lặp này sẽ chạy liên tục cho đến khi biến "running" được đặt thành "false".
            while (running[0]) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("stop")) {
                    running[0] = false;
                    System.out.println("Dừng chương trình...");
                }
            }
        });
        inputThread.start();

        //Ghi dữ liệu
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
                int ramdomNumber = random.nextInt(100,250);
                bufferedWriter.write(ramdomNumber +"\n");
                bufferedWriter.flush();
                // Sử dụng flush() để đảm bảo dữ liệu được ghi vào file ngay lập tức.
        } catch (IOException  e) {
            throw new RuntimeException(e);
        }
    }
}
