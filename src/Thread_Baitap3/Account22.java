package Thread_Baitap3;

public class Account22 implements Runnable{
    private int balance = 1000;

    @Override
    public void run() {
        try {
            withDraw();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void withDraw() throws InterruptedException {
        while (true) {
            balance -= 200;
            System.out.println(Thread.currentThread().getName() + balance);

            if (balance <= 0){
                System.out.println(Thread.currentThread().getName() + " Hết tiền thanh toán.");
                break;
            } else {
                System.out.println(Thread.currentThread().getName() + " Tiếp tục thực hiện");
            }
            Thread.sleep(3000);
        }
    }
}

