package bai1_Exception;

import java.util.Scanner;

public class Bai_Exception {
    public static void main(String[] args) {
        // Exception: là lỗi sinh ra trong quá trình phát triển dự án.
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <= arr.length; i++){
                System.out.println("Phần tử đã nhập: " +i);
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
            //Gọi vào: Khi ctrinh gặp Exception.
            // Exception sẽ bỏ qua mọi lỗi gặp phải, còn nếu chọ riêng thì nó chỉ khi bị lỗi đấy nó mới bỏ qua
            // lỗi đó để chạy tiếp ctrinh, còn đâu nếu kphai thì sẽ dừng ctrinh ngay lập tức.
            e.printStackTrace();
        } finally {
            //Được gọi : Khi ctrinh có lỗi hoặc không có lỗi.
            System.out.println("Finish  1");
        }

        try {
            for (int i = 0; i <= arr.length; i++){
                System.out.println(arr[i]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Finish 2");
        }
    }
}
