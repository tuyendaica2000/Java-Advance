package Abstract_BaiTap;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(HangSanXuat hangSanXuat, String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    //Lấy tên hãng sản xuất
    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    //Bắt đầu
    public void batDau() {
        System.out.println("Bắt đầu ...");
    }

    //Tăng tốc
    public void tangToc() {
        System.out.println("Tăng tốc ... ...");
    }

    //Dừng lại
    public void dungLai() {
        System.out.println("Dừng lại: xxx");
    }

    public abstract double layVanToc();
}
