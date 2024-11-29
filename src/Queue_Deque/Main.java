package Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("NVT 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("NVT 2");

        while (true) {
            String ten = danhSachSV.poll(); // --> Lấy ra và xóa
            if(ten == null) {
                break;
            }
            //peek: Lấy ra nhưng không xóa
            System.out.println(ten);
        }

    }
}
