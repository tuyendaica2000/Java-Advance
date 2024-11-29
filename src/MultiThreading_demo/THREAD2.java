package MultiThreading_demo;

public class THREAD2 extends Thread{
    @Override
    public void run() {


        while (SHAREDATA.getInstance().checkAvaiable()){
            synchronized (SHAREDATA.getInstance()){
                SHAREDATA.getInstance().notifyAll();
                try {
                    SHAREDATA.getInstance().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                char c = SHAREDATA.getInstance().getC();
                int code = (int) c - 32;
                c = (char) code;

                System.out.println("Thread 2: "+ c);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                SHAREDATA.getInstance().addTime(1000);
            }
        }
        System.out.println("T2 stoppp...");
        synchronized (SHAREDATA.getInstance()) {
            SHAREDATA.getInstance().notifyAll();
        }
    }
}
