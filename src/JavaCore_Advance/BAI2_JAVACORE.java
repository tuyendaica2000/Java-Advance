package JavaCore_Advance;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* ĐỀ BÀI
* Viết 1 chương trình chạy real-time, cứ n giây in 1 số nguyên random ra mà hình .
* Dừng chương trình sau n phút.
* */

public class BAI2_JAVACORE {
    public static void main(String[] args) {

        int nSecond = 5;
        int nMinutes = 1;

        Timer timer = new Timer();
        Random random = new Random();

        //Tạo TimerTask để in ra số ngẫu nhiên
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                int numberRandom = random.nextInt(160);
                System.out.println("Số ngẫu nhiên: "+numberRandom);
            }
        };
        //Lập lịch in số ngẫu nhiên mỗi n giây
        timer.scheduleAtFixedRate(timerTask,0,nSecond * 200);

        // Thực hiện dừng chương trình với n phút
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel(); // Dừng chương trình
                System.out.println("Chương trình dừng lại sau 0" + nMinutes + " phút");
            }
        },nMinutes * 60 * 1000);
    }
}
