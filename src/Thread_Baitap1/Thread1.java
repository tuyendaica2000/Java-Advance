package Thread_Baitap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread{
    List<Integer> list = new ArrayList<>();
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int rad = random.nextInt(100);
            list.add(rad);
            System.out.println("Số ngẫu nhiên Thread_1 : " +rad);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
