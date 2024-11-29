package Queue_Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque_Demo {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("NVT 2");
        danhSachSV.offerLast("NVT 4");
        danhSachSV.offerFirst("NVT 0");

        while (true) {
            String ten = danhSachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
