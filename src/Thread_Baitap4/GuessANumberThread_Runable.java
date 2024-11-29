package Thread_Baitap4;

public class GuessANumberThread_Runable implements Runnable{
    private int guessNumber = 0;
    private int count = 0;

    public GuessANumberThread_Runable(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100+1);
            count++;
            System.out.println(Thread.currentThread().getName() + " đã đoán số: " + randomNumber);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (randomNumber != guessNumber);
        System.out.println(Thread.currentThread().getName() + " đã đoán số: " + guessNumber + " sau " + count + " lần đoán.");
    }
}
