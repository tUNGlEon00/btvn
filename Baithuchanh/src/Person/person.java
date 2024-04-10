package Person;

import java.util.Scanner;

public class person {
 
      public String Ten;
      public int namSinh;
      public int soCCCD;

      public person ()
      {
        Ten = " le tung ";
        namSinh = 2004;
        soCCCD = 234567;
      }
    
      public void nhapThongTin ()
      {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap ten: ");
        Ten = sc.nextLine();
        System.out.print(" nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.print(" nhap so cccd: ");
        soCCCD = sc.nextInt();
      }

      public void xuatThongTin ()
      {
        System.out.println(" \nthong tin cua ban la: ");
        System.out.println(" ten: "+Ten);
        System.out.println(" tuoi: "+(2024-namSinh));
        System.out.print(" so cccd: "+soCCCD);
      }

      public void xuatThongTin ( String name, int age, int CCCD, String diaChi)
      {
        System.out.println(" \nthong tin cua ban la: ");
        System.out.println(" ten: "+name);
        System.out.println(" tuoi: "+age);
        System.out.println(" so cccd: "+CCCD);
        System.out.print(" dia chi la: "+diaChi);
      }

}