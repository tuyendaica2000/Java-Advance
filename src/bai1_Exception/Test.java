package bai1_Exception;

public class Test {
    public static void main(String[] args) {
        float chia = 0;
        try {
            chia = Vidu.Devide(5,0);
        } catch (DevideByZeroException e) {
            System.out.println(e.getMessage());
        }
        float tong = Vidu.Plus(2,10);
        System.out.println("Phép tính chia của 2 số a, b là: "+chia );
        System.out.println("Phép tính tổng của 2 số x, y là: "+tong );
    }
}
