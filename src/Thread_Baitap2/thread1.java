package Thread_Baitap2;

public class thread1 extends Thread{
    SharedDATA sharedDATA;

    public thread1(SharedDATA sharedDATA) {
        this.sharedDATA = sharedDATA;
    }

    //TẠO LỚP RUN để chạy ctrinh code của chúng ta.
    //Hàm này làm nvu sinh ngẫu nhiên ra tên 1 người và nó chỉ chạy 5 lần
    @Override
    public void run() {
        for (int i = 0; i < sharedDATA.userList.length; i++){
            //Để đồng bộ được 2 luồng: thread 1 - 2 thì ta sử dụng: --> synchronized <---
            synchronized (sharedDATA) {
                System.out.println("UserName: " + sharedDATA.userList[i]);

                //Sau khi hiển thị xong th sharedDATA của chúng ta sẽ thực hiện notifyAll
                sharedDATA.notifyAll();

//              Cách 1: dừng luồng thì phải check xem nó đủ điều kiện k
//                if ( i < sharedDATA.userList.length - 1) {
                    try {
                        sharedDATA.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
//                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        System.out.println("t1 stop...");
    }
}
