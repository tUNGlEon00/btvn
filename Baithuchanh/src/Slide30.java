import java.util.Scanner;
public class Slide30 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        int n;
        do {
            System.out.println(" nhap n: ");
             n = scanner.nextInt();
        } while (n<=0);
        int sodu, tong=0;
        while (n>0)
        {
           sodu=n % 10;
           n = n / 10;
           tong += sodu;
        }
        System.out.println(" tong cac chu so cua so do la:"+tong);
    
}
    
}
