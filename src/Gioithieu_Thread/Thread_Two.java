package Gioithieu_Thread;

public class Thread_Two implements Runnable{
    //Ta sẽ tạo ra 2 hàm tạo:
    Thread_One t1;

    // 2.Hàm tạo có đối
    public Thread_Two(Thread_One t1) {
        this.t1 = t1;
    }

    // 1.Hàm tạo không đối
    public Thread_Two() {
    }

    @Override
    public void run() {
        System.out.println("t2 running...");

        try {
            System.out.println("Join t1 into t2");
            t1.join();
            System.out.println("t1 được finish !!!");
            // ~~~~~ CÁCH 5 ~~~~~~: Sử dụng implements với Runnable
            for (int i = 0; i < 10; i++) {
                // --> Quay trở lại file: Test.Java để thực hiện lệnh
                try {
                    System.out.println("Thread_Two: "+i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
