package Thread_Baitap4;

public class GuessANumberThread extends Thread{
    /*
    Bạn hãy tạo ra một trò chơi để người dùng có thể nhập vào một số nguyên trong khoảng từ 1 đến 100.
    Sau đó bạn xây dựng một Thread đoán số, Thread này sẽ đạo ra các con số random cũng trong khoảng 1 đến 100 đó.
    Cứ mỗi lần random được một số, Thread sẽ in ra console cho người chơi có thể nhìn thấy.
    Thread sẽ dừng lại khi random ra một số trùng với số mà người chơi vừa nhập, đồng thời in ra số lần “đoán” để ra được con số đó.
    Lưu ý rằng, có 2 Thread cùng đoán số, để “thi thố” xem Thread nào “đoán” ra con số của người chơi nhanh nhất.
     */

    private int guessNumber = 0;
    private int count = 0;

    public GuessANumberThread(int guessNumber) {
        this.guessNumber = guessNumber;
    }


    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100+1);
            count++;
            //Khi sử dụng implements Runnable: K dùng được: .getName() mà phải dùng -->Thread.currentThread().getName()
            System.out.println(getName() + " đoán số: " + randomNumber);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (randomNumber != guessNumber);
        System.out.println(getName() + " đã đoán ra số " + guessNumber + " sau " + count + " lần đếm.");
    }
}
