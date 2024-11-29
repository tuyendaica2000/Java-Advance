package Thread_Luong;

public class Main {
    public static void main(String[] args) {
        // Cách 1: Thread main ==> Luồng chính
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            // gọi tới xử lý code trong phần này --> khi t1.start được gọi.
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("t1 >>: " + i);
                }
            }
        });
        t1.start();

        // Tạo Thread cách 2:
        Thread t2 = new ThreadTwo("T2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Tại thời điểm này ta có 3 luồng: t1 && t2 && Main Thread

        //Tạo Thread cách 3
        ThreadThree r = new ThreadThree("T3");
        Thread t3 = new Thread(r);
        t3.start();

        // main thread
        for (int i = 10; i < 15; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1>> " + t1.isAlive());
            System.out.println("t2>> " + t2.isAlive());
            System.out.println("t3>> " + t3.isAlive());
            System.out.println("Main Thread >>" +i);
        }
    }
}
