package chuong2;

import java.util.Scanner;

public class bai3s93 {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println(" nhap ten: ");
        String ten= sc.nextLine();
        System.out.println(" nhap nam sinh: ");
        int nam= sc.nextInt();
        if ( (2024-nam) < 16 ) {
            System.out.println( " Ban " + ten + " o do tuoi vi thanh nien " );
        } else {
            if ((2024-nam)>=16 && (2024-nam)<18) {
                System.out.println( " Ban " + ten + " o do tuoi truong thanh ");
            }
                System.out.println( " Ban " + ten + " da gia ");
        }

    }
}
