package Model;
import util.Configs;

public class nhanVienPartTime extends nhanVien {
    private int gioLamViec;

    public nhanVienPartTime (String ten, int gioLamViec)
    {
        this.ten=ten;
        this.gioLamViec=gioLamViec;
    }

    @Override
    public String loaiNhanVien ()
    {
        return " day la nhan vien thoi vu ";
    }

    public void tinhLuong ()
    {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}
