package ThreadPool_Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_1 {
    public static void main(String[] args) {
        // Khai báo một Thread Pool thông qua newFixedThreadPool(5) của Executors.
        // Thread Pool này cho phép thực thi cùng một lúc 5 Thread
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runable " + i);
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
