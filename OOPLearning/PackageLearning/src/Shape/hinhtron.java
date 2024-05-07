package Shape;

import java.util.Scanner;

public class hinhtron {
    
     public final float PI = 3.14f;
    public float r;
    public float cv;
    public float dt;

    public void NhapBanKinh()
    {
        System.out.print(" R = ");
        Scanner sc = new Scanner (System.in);
        r = sc.nextFloat();
    }

    public void tinhCV()
    {
        cv = 2*PI*r;
    }

    public void tinhDT()
    {
        dt = PI*r*r;
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