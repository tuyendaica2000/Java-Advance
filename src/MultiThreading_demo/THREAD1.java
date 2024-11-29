package MultiThreading_demo;

import java.util.Random;

public class THREAD1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Cách 2:
        int min = (int) 'a';
        int max = (int) 'z';
        int detal = max - min;

        Random random = new Random();

        //Ở đây nó chưa nói đến khi nào dừng ta có thể dùng while true cx dc
        while (SHAREDATA.getInstance().checkAvaiable()) {
            synchronized (SHAREDATA.getInstance()) {
                int rad = random.nextInt(detal + 1) + min;
                char c = (char) rad;

                SHAREDATA.getInstance().setC(c);

                System.out.println("Thread 1: "+ c);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                SHAREDATA.getInstance().addTime(2000);

                //Thiết lập trạng thái chờ và đánh thức luồng 2
                SHAREDATA.getInstance().notifyAll();
                try {
                    SHAREDATA.getInstance().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        System.out.println("T1 stop.");
        synchronized (SHAREDATA.getInstance()) {
            SHAREDATA.getInstance().notifyAll();
        }
    }
}
