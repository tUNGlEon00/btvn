package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInterger= new HashSet<Integer>();
        Scanner sc= new Scanner(System.in);

        hashSetInterger.add(1);
        hashSetInterger.add(3);
        hashSetInterger.add(2);
        hashSetInterger.add(8);
        hashSetInterger.add(12);
        hashSetInterger.add(9);
        hashSetInterger.add(25);
        hashSetInterger.add(4);
        hashSetInterger.add(11);

        System.out.println("Cac phan tu trong HashSetInterger");
        System.out.println(hashSetInterger);
        System.out.println("Nhap phan tu can thiet: ");
        number= sc.nextInt();

        if(!hashSetInterger.contains(number))
        {
            hashSetInterger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu tring HashSetInterger sau khi them: ");
            System.out.println(hashSetInterger);
        }
        else System.out.print("Phan tu "+ number+" da ton tai");
        

        
    }
    
}