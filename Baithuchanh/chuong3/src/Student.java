import java.util.Scanner;

public class Student {
    public String hoTen;
    public int namSinh;
    public int maSV;
    
    public void NhapHoTen ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap ho va ten: ");
        hoTen = sc.nextLine();
    }
    
    public void NhapNamSinh()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap nam sinh: ");
        namSinh = sc.nextInt();
    }

    public void NhapMSV()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap ma sinh vien: ");
        maSV = sc.nextInt();
    }

    public void TinhTuoi()
    {
        int tuoi;
        tuoi = 2024 - namSinh;
    }
}
