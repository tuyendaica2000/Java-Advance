package Gioithieu_Thread;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        // ~~~~~ CÁCH 4 ~~~~~~
        System.out.println("Thread main start ");
        Thread_One  threadOne = new Thread_One();
        threadOne.setName("A");
        threadOne.start();

        // ~~~~~ CÁCH 5 ~~~~~~.

        Thread_Two threadTwo = new Thread_Two();
        Thread t = new Thread(threadTwo);
        t.start();

        threadOne.join();
        System.out.println("Lúc này thực hiện xong luồng 1, tiếp tục join luồng 2...");
        t.join();

        System.out.println("Thread main stop");
//        try {
//            Thread.sleep(5000);
//            threadOne.stop();
//            t.stop();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
