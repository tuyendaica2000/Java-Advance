package ContructorDemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("");
        HoaDonTinhTien hd = new HoaDonTinhTien("High Land Coffee", 150000, 1.5);
        HoaDonTinhTien hd2 = new HoaDonTinhTien("High Land Coffee", 150000, 5.5);
        System.out.println("So tien mua coffee 2Land là: "+ hd.tinhTongTien());
        System.out.println("Kiểm tra khách mua coffee có lớn hơn 2kg không? \n(true: >2kg/false: <2kg): " +  hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiểm tra số tiền khách mua hàng có >500k? " + hd.kiemTraTongTienLonHon500k());
        System.out.println("Hóa đơn của bạn được giảm: " + hd.giamGia(10) + " khi hóa đơn >500k");
        System.out.println("Hóa đơn của bạn được giảm: " + hd2.giamGia(10)+ " khi hóa đơn >500k");
        System.out.println("Gía sau khi nhận giảm giá là: " + hd.giaSauKhiGiam(10) +" Gía gốc là: "+ hd.tinhTongTien());
        System.out.println("Gía sau khi nhận giảm giá là: " + hd2.giaSauKhiGiam(10)+" Gía gốc là: "+ hd2.tinhTongTien());
    }
}
