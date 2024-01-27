import java.util.Scanner;
public class bai5slide94 {
    public static void main(String[] args) throws Exception {
        int so, tong = 0;
            Scanner scanner = new Scanner(System.in);      
            do {
             System.out.println("Nhap vao so nguyen: ");
               so = scanner.nextInt();
               tong += so;
           } while (tong < 100); 
             System.out.println("Tong cac so = "+tong);
}
}
