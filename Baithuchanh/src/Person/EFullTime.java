package Person;
import java.util.Scanner;

public class EFullTime extends employee {

    public int luong;
    public int luongCung;
    public int luongThuong;
    public int doanhSo;
    
    public  void nhapDoanhSo()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println(" nhap doanh so cua nhan vien: ");
       doanhSo = sc.nextInt();
    }

    public void tinhLuongCung()
    {
      if ( viTri == "giam doc")
          luongCung = 1000;
          else 
               if (viTri == "quan li")
                  luongCung = 800;
                  else 
                      luongCung = 400;
    }

    public void tinhLuongThuong ()
    {
        luongThuong = ( 3 * doanhSo )/100;
    }

    public void tinhLuong()
    {
        luong = luongCung + luongThuong ;
    }
    
    public void hienthiLuong()
    {
        System.out.println(" luong cua nhan vien "+ Ten +" o vi tri "+viTri+"="+luong);
    }
}
