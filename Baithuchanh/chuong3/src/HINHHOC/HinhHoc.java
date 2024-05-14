package HINHHOC;

import java.util.Scanner;

public class HinhHoc {
 
    public final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich; 
    
    public HinhHoc ()
    {
        ten = " hinhhoc ";
        chuVi = 12;
        dienTich = 13;
    }

    public void xuatTen ()
    {
        System.out.println(" ten hinh la: "+ten);
    }

    public void inChuVi ()
    {
        System.out.println(" chu vi= "+chuVi);
    }

    public void inDienTich ()
    {
        System.out.println(" Dien tich= "+dienTich);
    }
    
    public void inTheTich ()
    {
        System.out.println(" the tich= "+theTich);
    }

    
}
