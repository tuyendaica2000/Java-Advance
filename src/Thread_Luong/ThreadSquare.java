package Thread_Luong;

public class ThreadSquare extends  Thread{
    SharedData sharedData;

        //Tạo ra hàm đối số
    public ThreadSquare(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        //Nhiệm vụ: Sinh ra số bình phương, in ra.
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int rad = sharedData.getRad();
                rad*=rad;
                System.out.println("Số bình phương: " +rad);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        System.out.println("T2 stop");
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
