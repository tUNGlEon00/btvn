import java.util.Scanner;

public class HinhTronDemo
{
    public final float PI = 3.14f;
    public float banKinh;
    public float chuVi;
    public float dienTich;

    public void nhapBanKinh()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print(" nhap R = ");
        banKinh = sc.nextFloat();
    }
    public void tinhCV()
    {
        chuVi = 2 * PI * banKinh;
    }
    public float tinhDT()
    {
        dienTich = PI * banKinh * banKinh;
        return dienTich;
    }
    public void inCV()
    {
        System.out.println(" Chu Vi la: " + chuVi);
    }

      public static void main(String[] args) throws Exception 
      {
        HinhTronDemo ht = new HinhTronDemo();
        ht.nhapBanKinh();
        ht.tinhCV();
        System.out.println(" thong tin cua ht la: ");
        ht.inCV();
        System.out.println(" Dien Tich la: " +  ht.tinhDT());
      }
}      