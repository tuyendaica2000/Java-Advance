package Abstract_BaiTap;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Honda","Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Toyota","Japan");
        HangSanXuat h3 = new HangSanXuat("Mercedes","Germany");

        MayBay p1 = new MayBay(h3, "Dầu");
        PhuongTienDiChuyen p2 = new XeOto(h2,"Xăng");
        PhuongTienDiChuyen p3 = new XeDap(h1);

        System.out.println("Lấy tên hãng sản xuất của 'Máy Bay': ");
        System.out.println(p1.layTenHangSanXuat());

        System.out.print("Lấy vận tốc của xe Đạp: ");
        System.out.println(p3.layVanToc() +"km/h");
        System.out.print("Lấy vận tốc của xe Oto: ");
        System.out.println(p2.layVanToc()+"km/h");
        System.out.print("Lấy vận tốc của Máy Bay: ");
        System.out.println(p1.layVanToc()+"km/h");
        System.out.print("Máy bay chẩn bị ");
        p1.catCanh();
    }
}
