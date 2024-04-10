package Shape;

import java.util.Scanner;

public class hinhchunhat {

   public float dai;
   public float rong;
   public float cv;
   public float dt;

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
    cv = ( dai + rong ) * 2;
   }

   public  void tinhDT()
   {
    dt = dai * rong;
   }

   public void inCV()
   {
    System.out.println(" chu vi la: "+cv);
   }

   public void inDT()
   {
    System.out.println(" dien tich la: "+dt);
   }
   
}