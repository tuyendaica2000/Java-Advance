package ContructorDemo;

public class HoaDonTinhTien {
    private String tenLoaiCaPhe;
    private double giaTien1kg;
    private double khoiLuong;

    public HoaDonTinhTien(String ten, double gia, double kluong) {
        this.tenLoaiCaPhe = ten;
        this.giaTien1kg = gia;
        this.khoiLuong = kluong;
    }

    public double tinhTongTien() {
        return this.giaTien1kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl) {
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500k()
    {
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x) {
        if (this.tinhTongTien() > 500000) {
            return (x/100) * this.tinhTongTien();
        } else {
            return 0;
        }
    }

    public double giaSauKhiGiam(double x) {
        // Cach 1:
        /*if (this.tinhTongTien() > 500000) {
            return  this.tinhTongTien()-((x/100) * this.tinhTongTien());
        } else {
            return this.tinhTongTien();
        }*/

        //Cach 2:
        return this.tinhTongTien() - this.giamGia(x);

    }
}
