package Thread_Baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên để Thread tìm kiếm !!!");
        int number = sc.nextInt();

        GuessANumberThread thread1 = new GuessANumberThread(number);
        GuessANumberThread thread2 = new GuessANumberThread(number);
        GuessANumberThread thread3 = new GuessANumberThread(number);

        // Cách sử dụng khi thực hiện implement Runable

        /*Thread thread_1 = new Thread(thread1);
        Thread thread_2 = new Thread(thread2);
        thread_1.setName("Thread 1");
        thread_2.setName("Thread 2");
        thread_1.start();
        thread_2.start();*/


        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
