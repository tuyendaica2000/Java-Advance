package Abstract_BaiTap;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto( HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(hangSanXuat, "Xe Oto");
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 60;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
