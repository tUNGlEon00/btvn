import java.util.Scanner;

public class person {
    public String hoTen;
    public String maCCCD;
    public int namSinh , tuoi;


    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.err.print("ma can cuoc cong dan : ");
        maCCCD = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        namSinh = sc.nextInt();
    }


    public int tinhTuoi () {
        tuoi = 2024 - namSinh;
        return tuoi;
    }
    public void inGiaTri () {
        System.out.println("ho va ten = " + hoTen);
        System.out.println("can cuoc cong dan = " + maCCCD);
        System.out.println("nam sinh = " + namSinh);
    }

    public void inGiaTri ( String name, String number, int age) {
        System.out.println("\nho va ten = " + name);
        System.out.println("can cuoc cong dan = " + number);
        System.out.println("nam sinh = " + age);
    }
    public person()
    {
        hoTen = "nguyen van a";
        maCCCD = "123456789";
        namSinh = 2000;
    }
    public void HienThi () {
        System.out.println("ho va ten = " + hoTen);
        System.out.println("can cuoc cong dan = " + maCCCD);
        System.out.println("nam sinh = " + namSinh);
    }
}