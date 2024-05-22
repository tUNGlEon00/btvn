package chuong2;

import java.util.Scanner;

public class bai5s94 {
    public static void main(String[] args) throws Exception {
        int so, tong = 0;
            Scanner scanner = new Scanner(System.in);  
            while (tong <= 100)    
            {
             System.out.println("Nhap vao so nguyen: ");
               so = scanner.nextInt();
               tong += so;
            } 
             System.out.println("Tong cac so = "+tong);
}
}
