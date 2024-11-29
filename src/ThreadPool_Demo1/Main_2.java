package ThreadPool_Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_2 {
    public static void main(String[] args) {
        // Khai báo một Thread Pool thông qua newCachedThreadPool của Executors.
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable " + i);
            executorService.execute(myRunnable);
        }

        executorService.shutdown();
    }
}
