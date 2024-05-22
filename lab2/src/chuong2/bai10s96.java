package chuong2;

import java.util.Scanner;

public class bai10s96 {
    
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    String chuoi;
    char kiTu;
    do
    {
        System.out.println(" nhap chuoi bat ki: ");
        chuoi=sc.nextLine();
    }while(chuoi.length()>80);
    System.out.println(" nhap ki tu bat ki: ");
    kiTu=sc.next().charAt(0);
    int viTri = chuoi.indexOf(kiTu);
    int dem = 0;

    while (viTri >= 0) {
        dem +=1;
        viTri = chuoi.indexOf(kiTu, viTri + 1);
    }

    System.out.println("So lan xuat hien cua " + kiTu + " la: " + dem);

}
}
