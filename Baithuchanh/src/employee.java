import java.util.Scanner;

public class employee {

    public String hoTen;
    public int Tuoi;
    public String diaChi;
    public float luong;

    public void NhapHoTen()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap ho va ten: ");
        hoTen = sc.nextLine();
    }
    
    public void NhapTuoi()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void NhapDiaChi()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void NhapLuong()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi ban nhap luong: ");
        luong = sc.nextFloat();
    }
}
