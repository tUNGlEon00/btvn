import java.util.Scanner;
public class bai1slide92 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print(" nhap vao so a: ");
        a=sc.nextDouble();
        do {
        System.out.print(" nhap vao so b: ");
        b=sc.nextDouble();
           }while(b==0);
           // tinh tong, hieu, tich, thuong, chia co du
        System.out.print(" tong cua a va b la: "+(a+b)+"\n");
        System.out.print(" hieu cua a va b la: "+(a-b)+"\n");
        System.out.print(" tich cua a va b la: "+(a*b)+"\n");
        System.out.print(" thuong cua a va b la: "+(a/b)+"\n");
        System.out.print(" phep chia lay du cua a va b la: "+(a%b)+"\n");
          // So sanh 2 so
          if ( (a-b)==0 )
               System.out.print(" 2 so bang nhau ");
          else 
               if ( (a-b)>0 )
               System.out.print(" a lon hon b ");
               else
               System.out.print(" a nho hon b ");

}
}