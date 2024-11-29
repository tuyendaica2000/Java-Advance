package Thread_Baitap3;

import javax.security.auth.login.AccountException;

public class Main {
    public static void main(String[] args) {

        Account22 account = new Account22();
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        Thread t3 = new Thread(account);

        t1.start();
        t2.start();
        t3.start();
    }
}
