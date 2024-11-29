package ThreadPool_Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 0; i <10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runable " + i);
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}
