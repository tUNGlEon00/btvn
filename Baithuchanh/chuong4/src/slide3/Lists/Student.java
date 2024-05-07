
package slide3.Lists;
import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;

    Scanner sc = new Scanner(System.in);

    public void nhapTT()
    {
     System.out.println(" Moi ban nhap thong tin: ");
     System.out.println(" Ten: ");
     FullName = sc.nextLine();
     System.out.println(" Tuoi: ");
     Age = sc.nextInt();
    }

    public void xuatTT()
    {
     System.out.println(" Thong tin cua ban la: ");
     System.out.println(" Ten: "+FullName);
     System.out.println(" Tuoi: "+Age);
    }
    
    public void themTT(String diaChi, int maCCCD)
    {
     System.out.println(" Nhap dia chi: ");
     diaChi = sc.nextLine();
     System.out.println(" Nhap ma cccd: ");
     maCCCD = sc.nextInt();
     
     System.out.println(" Them thong tin cua ban: ");
     System.out.println(" Ten: "+FullName);
     System.out.println(" Tuoi: "+Age);
     System.out.println(" Dia Chi: "+diaChi);
     System.out.println(" Ma so cccd: "+maCCCD);
    }

    public void suaTT()
    {
     System.out.println(" Thong tin can sua: ");
     System.out.println(" Nhap lai ten: ");
     FullName = sc.nextLine();
     System.out.println(" Nhap lai tuoi: ");
     Age = sc.nextInt();
     System.out.println(" Nhap lai dia chi: ");
     String diaChi = sc.nextLine();
     System.out.println(" Nhap lai ma cccd: ");
     int maCCCD = sc.nextInt();
     
     System.out.println(" Thong tin cua ban: ");
     System.out.println(" Ten: "+FullName);
     System.out.println(" Tuoi: "+Age);
     System.out.println(" Dia Chi: "+diaChi);
     System.out.println(" Ma so cccd: "+maCCCD);
    }

    public static void main (String[] args){
        Student s1 = new Student();
        s1.nhapTT();
        s1.xuatTT();
    }
}
