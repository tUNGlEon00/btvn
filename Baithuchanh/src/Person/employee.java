package Person;
import java.util.Scanner;

public class employee extends person {

    public String maNV;
    public String viTri;
    public int maPhong;

    public employee ()
    {
        maNV = "2ab78";
        viTri = "quan li";
        maPhong = 234;
    }

    public void nhapThongTin()
    { 
      super.nhapThongTin();  
      Scanner sc = new Scanner(System.in);    
      System.out.println(" nhap ma nhan vien: ");
      maNV = sc.nextLine();
      System.out.println(" nhap vi tri: ");
      viTri = sc.nextLine();
      System.out.println(" nhap ma phong: ");
      maPhong = sc.nextInt();
    }

    public void xuatThongTin()
    {   
        super.xuatThongTin();
        System.out.println(" ma nhan vien la: "+maNV);
        System.out.println(" vi tri la: "+viTri);
        System.out.println(" ma phong la: "+maPhong);    
    }
    
}
