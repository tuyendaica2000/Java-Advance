package Gioithieu_Thread;

public class Main {
    public static void main(String[] args) {
        // Nó sẽ tự sinh ra 1 Thread Main--> Luồng chính.
        System.out.println("Start ~ ~ ~");


        // ~~~~~ CÁCH 1 ~~~~~~: Để tạo Luồng(Thread)
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
//                //Viết các hàm các lệnh trong này
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1 >> "+i);
                }
            }
        });
        t.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2 >> "+i);
                }
            }
        });
        t2.start();


        // ~~~~~ CÁCH 2 ~~~~~~
        new Thread(new Runnable() {
            @Override
            public void run() {
                //Viết code trong này để thực hiện
            }
        }).start();


        //  ~~~~~ CÁCH 3 ~~~~~~
        new Thread(()->{
            // Viết code ở đây
        }).start();

        // ~~~~~ CÁCH 4 ~~~~~~: Tách biệt riêng code của nó ra 1 file khác: Thread_One + Test

        // ~~~~~ CÁCH 5 ~~~~~~: Kế thừa từ Runnable. Sử dụng implements.

        System.out.println("End ! ! !");
    }
}
