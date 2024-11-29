package MultiThread_Gioithieu;

public class Thread2 extends Thread {
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }



    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            synchronized (sharedData){
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int result = (sharedData.rad) * (sharedData.rad);
                System.out.println("t2 >" + result);
                sharedData.notifyAll();
            }
        }
    }
}
