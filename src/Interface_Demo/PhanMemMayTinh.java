package Interface_Demo;

public class PhanMemMayTinh implements SapXepInterface, MayTinhBoTui_Interface{
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

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for ( i = 0; i < n; i++) {
            key = arr[i];
            j = i-1;
            while (j >=0 && arr[i] > key) {
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for ( i = 0; i < n; i++) {
            key = arr[i];
            j = i-1;
            while (j >=0 && arr[i] < key) {
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
