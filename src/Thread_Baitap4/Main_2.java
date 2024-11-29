package Thread_Baitap4;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên để 2 Thread thi đua...");
        int number = sc.nextInt();

        GuessANumberThread t1 = new GuessANumberThread(number);
        GuessANumberThread t2 = new GuessANumberThread(number);
        GuessANumberThread t3 = new GuessANumberThread(number);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
