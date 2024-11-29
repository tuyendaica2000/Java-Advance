package Thread_Luong;

public class MyBank {
    int money;

    public MyBank() {
    }

    public MyBank(int money) {
        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public synchronized void witdDraw (int money, String threadName){
        if (money<= this.money){
            System.out.println("So tien rut: " + money+  ", thread name" + threadName);
            this.money-=money;
        }else {
            System.out.println("Số tiền rút vợt quá số tiền hiện tại."+  ", thread name" + threadName);
        }
        System.out.println("Số tiền hiện tại" + this.money);
    }
}
