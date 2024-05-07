package HINHHOC;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    public float dai;
    public float rong;

    public HinhChuNhat ()
    {
        ten = " hinh chu nhat ";
        chuVi = 10;
        dienTich = 12;
    }

    public void nhapdulieu()
    {
     Scanner sc = new Scanner (System.in);
     System.out.println(" nhap chieu dai: ");
     dai = sc.nextFloat();
     System.out.println(" nhap chieu rong: ");
     rong = sc.nextFloat();
    }
 
    public void tinhCV()
    {
     chuVi = ( dai + rong ) * 2;
    }
 
    public  void tinhDT()
    {
     dienTich = dai * rong;
    }
    
}
