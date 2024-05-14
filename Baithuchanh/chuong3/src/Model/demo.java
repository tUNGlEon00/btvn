package Model;
import util.Configs;

public class demo {
    public static void main(String[] args)
    {
     //khoi tao cac doi tuong

     nhanVienFullTime sep = new nhanVienFullTime(" Le Thanh Tung ", 100);
     sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);

     nhanVienFullTime linh0 = new nhanVienFullTime("Cao Thanh Ha", 9);
     linh0.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

     nhanVienPartTime ok = new nhanVienPartTime("Gcaothu", 22);
     
     // tinh luong 

     sep.tinhLuong();
     linh0.tinhLuong();
     ok.tinhLuong();

     // xuat thong tin

     sep.xuatThongTin();
     linh0.xuatThongTin();
     ok.xuatThongTin();
    }
    
}
