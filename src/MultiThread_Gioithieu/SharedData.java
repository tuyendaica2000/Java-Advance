package MultiThread_Gioithieu;

public class SharedData {
    public int x = 0;
    public int rad = 0;

    public synchronized void add(int plus){
        x += plus;
        System.out.println("\nDãy số 'x': " + x);
        for (int i = 0; i <x; i++) {
            System.out.print(" " + i);
        }
    }
}
