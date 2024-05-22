import java.util.Scanner;

public class LTT832Person {
    public String Hoten;
    public int maSv;
    public int Tuoi; 

    Scanner sc = new Scanner(System.in);

    public void nhap()
    {
        System.out.println(" nhap thong tin: ");
        System.out.println(" nhap ho va ten: ");
        Hoten = sc.nextLine();
        System.out.println(" nhap ma sinh vien: ");
        maSv = sc.nextInt();
        System.out.println(" nhap tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void xuat()
    {
        System.out.println(" thong tin cua ban la: Ho va ten: " + Hoten + " /ntuoi: " + Tuoi + " / ma sinh vien: " + maSv);
    }
}
