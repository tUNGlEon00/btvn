package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString= new HashSet<>();
        Scanner sc= new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println("Cac phan tu trong HashSetString");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name= sc.nextLine();


        if(hashSetString.contains(name))
        {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong HashSetInterger sau khi xoa: ");
            System.out.println(hashSetString);
        }
        else System.out.print(" xoa ko thanh cong ");
        

    }
}