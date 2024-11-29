package ThreadPool_Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main_3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future> listFuture = new ArrayList<Future>();
        for (int i = 0; i < 10; i ++) {
            MyRunnable myRunnable = new MyRunnable("Runable " + i);
            Future future = executorService.submit(myRunnable);
            listFuture.add(future);
        }
        for (Future future : listFuture) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        // Phương thức này đã nói ở trên đây rồi
        executorService.shutdown();
    }
}
/*
Báo cáo thực tập ngày: 08/10/2024.
Dear Anh/ Chị,
Em là Nguyễn Văn Tuyến , TTS Java
Em xin báo cáo nội dung, kiến thức đã làm được trong ngày
Những nội dung đã thực hiện được hôm nay:
        + Làm nốt bài tập khóa Java Core Basic.
        + Ôn lại về Overriding + làm bài tập thêm.
        + Ôn luyện thêm về Socket.
        + Tìm hiểu về SpringBoot, cài đặt IDE support.
Trên đây là báo cáo thực tập của em ngày: 08/10/2024
**/