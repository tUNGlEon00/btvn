import java.util.Scanner;

public class bai6slide95{
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n;
    do
    {
        System.out.println(" nhap so nguyen duong n: ");
        n=sc.nextInt();
    }while(n<=0);
    int giaithua=1;
    int m = 1;
    do 
    {   
        giaithua *=m;
        ++m;

    }while(m<=n);     
    System.out.println(" giai thua cua so n la: "+ giaithua);
}
}