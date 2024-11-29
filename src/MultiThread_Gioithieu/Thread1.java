package MultiThread_Gioithieu;

import java.util.Random;

public class Thread1 extends Thread{
    SharedData sharedData;

    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                int rad = random.nextInt(100);
                sharedData.rad = rad;
                System.out.println("t1 sinh số ngẫu nhiên được: " +rad);
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
