import java.util.Scanner;
import java.util.ArrayList;

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

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <LTT832Person> b = new ArrayList<LTT832Person>();
        LTT832Person ps = new LTT832Person();
        int n;
        System.out.println(" nhap n = ");
        n = sc.nextInt();

        // them moi
        for (int i = 0; i < n; i++){
            System.out.println(" nhap phan tu thu " + i + " = ");
            ps.nhap();
            b.add(i, ps);
        }
        
        // sua 
        for  (int i = 0; i < n; i++){
            System.out.println(" sua thong tin: ");
            ps.nhap();
            b.set(i, ps);
        }

        // xoa
        for ( int i = 0; i < n; i++){
            System.out.println(" xoa thong tin: ");
            ps.nhap();
            b.remove(i, ps);
        }

        // hien thi
        for (int i = 0; i < n; i++){
            System.out.println(" hien thi thong tin: ");
            b.ps.xuat().get(i);
        }

    }
}
