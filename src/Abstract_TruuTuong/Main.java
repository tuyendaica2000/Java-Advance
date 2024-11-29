package Abstract_TruuTuong;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(7,9);
        ToaDo td3 = new ToaDo(12,1);

//        Hinh h = new Hinh(td1) ==> Như này là lỗi.
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 10);
        Hinh h3 = new HinhChuNhat(td3, 5, 10);

        System.out.println("Diện tích của h1: " +h1.tinhDienTich());
        System.out.println("Diện tích của h2: " +h2.tinhDienTich());
        System.out.println("Diện tích của h3: " +h3.tinhDienTich());
    }
}
