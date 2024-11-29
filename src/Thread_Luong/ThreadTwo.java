package Thread_Luong;

public class ThreadTwo extends Thread{
    String name;
    public ThreadTwo (String name) {
        this.name= name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">>" +i + ">>" + isAlive());
        }
    }
}
