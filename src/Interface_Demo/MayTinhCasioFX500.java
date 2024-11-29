package Interface_Demo;

public class MayTinhCasioFX500 implements MayTinhBoTui_Interface{
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        if (a > 0 && b > 0) {
            return a/b;
        } else if (a > 0 && b == 0) {
            System.out.println("Infinity");
        }
            return 0;
    }
}
