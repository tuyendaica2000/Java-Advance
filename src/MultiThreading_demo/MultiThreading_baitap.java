package MultiThreading_demo;

/* ~~~~~~~~~~~~~~~~~~ BÀI  TOÁN ~~~~~~~~~~~~~~~~~~~~~
* Thread 1 thực hiện sinh ngẫu nhiên các ký tự từ a-z A-Z, cứ 2s thì sinh 1 lần
* Thread 2 thực hiện biến các ký tự thường sinh ra từ Thread 1 thành ký tự hoa,
cứ sau 1s thì thực hiện 1 lần.
* --> Yêu cầu đồng bộ 2 Thread ( wait, notify)
* Nếu tổng thời gian của 2 thread là 20s thì dừng 2 Thread lại.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiThreading_baitap {
    public static void main(String[] args) {
                //cách 1: TẠO 1 MẢNG ĐỂ LƯU CÁC KÍ TỰ từ a-z A-Z:
//        List<Character> cList = new ArrayList<>();

        THREAD1 t1 = new THREAD1();
        THREAD2 t2 = new THREAD2();

        t1.start();
        t2.start();
    }
}
