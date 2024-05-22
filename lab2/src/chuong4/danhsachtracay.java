package chuong4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class danhsachtracay {
    public static void main(String[] args) {
    String Name;
    Scanner sc = new Scanner(System.in);
    HashSet<String> traiCayHashSet = new HashSet<>();
    List<String> traicayList = new ArrayList<>();

    traicayList .add("tao");
    traicayList .add("cam");
    traicayList .add("le");

    System.out.println("cac phan tu trong Hashset : ");
    System.out.println(traicayList);

    System.out.println("nhap phan tu can them : ");
    Name = sc.nextLine();
    if(!traicayList  .contains(Name)){
     traicayList  .add(Name); 
     System.out.println("them thanh cong! ");
     System.out.println("Cac phan tu trong traicayList   da duoc them : ");
     System.out.println(traicayList  );
 }else {
     System.out.println("them khong thanh cong");
 }

 System.out.println("\nHashSet sau khi thêm các phần tử từ List:");
        Iterator<String> iterator = traiCayHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("xoa phan tu : ");
        Name = sc.nextLine();
        if(traicayList  .contains(Name)){
         traicayList  .remove(Name); 
         System.out.println("xoa thanh cong! ");
         System.out.println("Cac phan tu trong traicayList   da duoc xoa: ");
         System.out.println(traicayList  );
     }else {
         System.out.println("xoa khong thanh cong");
     }
     System.out.println("\nHashSet sau khi xóa các phần tử của List:");
     iterator = traiCayHashSet.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
}
}