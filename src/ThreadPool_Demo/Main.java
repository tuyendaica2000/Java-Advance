package ThreadPool_Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static Long N = 5000000000l;

    //Chạy đơn luồng
    public static void sumTest() {
        long start = System.currentTimeMillis();

        long sum = 0;
        for (long i = 0; i < N; i++) {
            sum+=i;
        }
        sum = 0;
        for (long i = 0; i < N; i++) {
            sum+=i;
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("Thời gian chạy đơn Thread 1.000.000.000: "+end);
    }



                            // Chạy đa luồng

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long start = System.currentTimeMillis();

        Future<Long> sumFuture1 = executorService.submit(() -> {
            long sum = 0;
            for (long i = 0; i < N; i++){
                sum+=i;
            }
            return sum;
        });

        Future<Long> sumFuture2 = executorService.submit(() -> {
           long sum = 0;
           for (long i = 1; i < N ; i++) {
               sum += i;
           }
           return sum;
        });

        while (!sumFuture1.isDone() || !sumFuture2.isDone()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long end = System.currentTimeMillis() - start;
        System.out.println("Thời gian chạy 2 Thread " + N + " là: "+end);

        // Chạy hàm đơn Thread
        sumTest();

        executorService.shutdown();
    }
}



/*

Báo cáo thực tập ngày 30/09/2024.
Dear Anh/ Chị,
Em là Nguyễn Văn Tuyến , TTS Java
Em xin báo cáo nội dung, kiến thức đã làm được trong ngày
Những nội dung đã thực hiện được hôm nay:
        + Làm ví dụ Thread, Thread Priority.
        + Thread Pool, MultiThread: Khái niệm + ví dụ
        + Tìm hiểu Queue, Deque là gì và cách triển khai.
Trên đây là báo cáo thực tập của em ngày 30/09/2024.

*/
