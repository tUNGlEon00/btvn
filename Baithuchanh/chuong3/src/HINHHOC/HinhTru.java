package HINHHOC;
import java.util.Scanner;


public class HinhTru extends HinhTron {

    public float chieuCao;

    public HinhTru()
    {
        ten = " hinh tru ";
        chuVi = 44;
        dienTich = 32;
        theTich = 30;
    }

    public void nhapChieuCao ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" chieu cao = ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich ()
    {
        theTich = PI*banKinh*banKinh*chieuCao;
    }
    
}
