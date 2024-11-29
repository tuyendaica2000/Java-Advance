package Gioithieu_Thread;

public class Test_1 {
    public static void main(String[] args) {
        // Bài toán đặt ra: Làm sao để join Thread_1 vào Thread_2 ???
        Thread_One t1 = new Thread_One();
        Thread t2 = new Thread(new Thread_Two(t1));

        t1.start();
        t2.start();
        System.out.println("Thread main stop");
    }
}
