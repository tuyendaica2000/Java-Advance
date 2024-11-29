package Interface_Demo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5+3= " + mfx500.cong(5,3));
        System.out.println("5*3= " + mfx500.nhan(5,3));
        System.out.println("5-3= " + mvn500.tru(5,3));
        System.out.println("1/0= " + mvn500.chia(1,0));

        System.out.println("Test câu b: ");
        double[] arr = new double[] {1,5,4,8,9,7};
        double[] arr2 = new double[] {6,5,1,3,2,4};
        SapXepChen sapXepChen = new SapXepChen();
        SapXepChon sapXepChon = new SapXepChon();

        sapXepChen.sapXepTang(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + "       ");
        }
        System.out.println("  ");
        sapXepChon.sapXepGiam(arr2);
        for (int i = 0; i <arr2.length; i++) {
            System.out.print(arr2[i] + "       ");
        }

        System.out.println("");
        System.out.println("Test câu c:");
        PhanMemMayTinh phanMemMayTinh = new PhanMemMayTinh();
        System.out.println("4+9= "+ phanMemMayTinh.cong(4,9));
    }
}
/*

* */