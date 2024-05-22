package chuong4;
import java.util.LinkedList;
import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        int n,so;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        
        for(int i = 0; i < n ; i++) {
            System.out.println("nhap phan tu thu " + i + ": ");
            so = sc.nextInt();
            linkedListInt.add(so);
        }
    
        int sum = 0;
        int Luutru = 0;
            for(int num: linkedListInt) {
                if( num % 2 ==0){
                    sum += num; 
                    Luutru++;
                }
            }
    
        if(Luutru==0){
            System.out.println("danh sach khong co so chan!");
        } else {
            int Total = sum/Luutru;
            System.out.println("trung binh cong cua day la :" + Total);
        }     
      }
}
