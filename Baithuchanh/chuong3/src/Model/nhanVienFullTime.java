package Model;
import util.Configs;

public class nhanVienFullTime extends nhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public nhanVienFullTime ( String ten ){ this.ten = ten; }
    public nhanVienFullTime ( String ten, int ngayLamThem )
    {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu ( int loaiChucVu )
    {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien()
    {  
         return " day la nhan vien toan thoi gian ";
    }

    public void tinhLuong()
    {
        if ( loaiChucVu == 1)
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem ;
        
        if ( loaiChucVu == 0)  
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem ;
    } 
    
}
