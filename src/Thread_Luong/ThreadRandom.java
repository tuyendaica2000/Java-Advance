package Thread_Luong;

import java.util.Random;

public class ThreadRandom extends  Thread{
    SharedData sharedData;

    //Tạo 1 hàm tạo: alt + insert
    public ThreadRandom(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            synchronized (sharedData) {
                // Số ngẫu nhiên sẽ bằng:
                int rad = random.nextInt(100)+1;
                sharedData.setRad(rad);
                System.out.println("Rad: "+rad);
                //Triển khai thêm. Sau khi đã sinh xong thì nó sẽ đưa về trạng thái wait nó đánh thức luồng t2 chạy
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("T1 Stop");
    }
}
