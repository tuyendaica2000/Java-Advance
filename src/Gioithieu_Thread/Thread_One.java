package Gioithieu_Thread;

public class Thread_One extends Thread{
    @Override
    public void run() {

        //  ~~~~~ CÁCH 4 ~~~~~~

        for (int i = 0; i < 10; i++) {
            System.out.println("t1 running ...");

            // --> Quay trở lại file: Test.Java để thực hiện lệnh
            try {
                System.out.println("Thread_One: "+i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
