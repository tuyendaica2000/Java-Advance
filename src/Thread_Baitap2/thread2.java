package Thread_Baitap2;

public class thread2 extends Thread{
    SharedDATA sharedDATA;

    public thread2(SharedDATA sharedDATA) {
        this.sharedDATA = sharedDATA;
    }

    @Override
    public void run() {
        //Mới đầu giống như thread 1, khởi tạo hàm và sinh ra địa chỉ ngẫu nhiên.
        for (int i = 0; i < sharedDATA.addressList.length; i++) {
            synchronized (sharedDATA) {
                //Lúc này cũng giống như thread 1
                sharedDATA.notifyAll();

                try {
                    sharedDATA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Address: " + sharedDATA.addressList[i]);
            }
        }

//        Cách 2 muốn dừng luồng
        synchronized (sharedDATA) {
            sharedDATA.notifyAll();
        }
        System.out.println("t2 stop...........");
    }
}
