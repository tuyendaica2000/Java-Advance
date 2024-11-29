package ThreadPool_Demo1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name) {
        // Khởi tạo Runnable với biến name truyền vào
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " đang thực thi...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " kết thúc.");
    }
}
