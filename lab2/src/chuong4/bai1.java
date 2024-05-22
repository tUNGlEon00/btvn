package chuong4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
   
    public static void main(String[] args) {
        ArrayList<Integer> Arraylist = new ArrayList<>();
        int n;
        int so,number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        
        for(int i = 0; i < n ; i++) {
            System.out.println("nhap phan tu thu " + i + ": ");
            so = sc.nextInt();
            Arraylist.add(so);
        }
        int max = Arraylist.get(0);
        //tim max
            for(int i = 1; i < Arraylist.size() ;i++) {
                if ( Arraylist.get(i).compareTo(max) > 0) {
                    max = Arraylist.get(i);
                }
            }
            System.out.println("Phan tu lon nhat trong mang " + max);
        System.out.println(Arraylist);

        System.out.println("nhap phan tu can them : ");
        number = sc.nextInt();

        if(!Arraylist.contains(number)){
            Arraylist.add(number); 
            System.out.println("them thanh cong! ");
            System.out.println("Cac phan tu trong Arraylist da duoc them: ");
            System.out.println(Arraylist);
        }else {
            System.out.println("phan tu " + number + " da ton tai!");
        }

        Collections.sort(Arraylist);
        System.out.println("Cac phan tu trong Arraylist sau khi sap xep: ");
        System.out.println(Arraylist);
    }

}