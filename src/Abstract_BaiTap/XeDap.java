package Abstract_BaiTap;

public class XeDap extends PhuongTienDiChuyen{


    public XeDap(HangSanXuat hangSanXuat) {
        super(hangSanXuat, "Xe Dap");
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
