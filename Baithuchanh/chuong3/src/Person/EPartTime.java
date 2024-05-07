package Person;
import java.util.Scanner;

public class EPartTime extends employee {

    public int luong;
    public int soGio;
    public int luong1Gio;

    public void nhapluong1Gio()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" nhap luong 1 gio: ");
        luong1Gio = sc.nextInt();
    }

    public void nhapSoGio()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" nhap so gio lam: ");
        soGio = sc.nextInt();
    }

    public int tinhLuong()
    {
        luong = luong1Gio*soGio;
        return luong;
    }

}
