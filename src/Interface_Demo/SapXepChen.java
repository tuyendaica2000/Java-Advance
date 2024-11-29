package Interface_Demo;

public class SapXepChen implements SapXepInterface{
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
