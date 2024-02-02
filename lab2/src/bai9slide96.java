import java.util.Scanner;
public class bai9slide96 {  
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String chuoi;
    int dem1=0, dem2=0, dem3=0;
    System.out.println(" nhap chuoi bat ki: ");
    chuoi = sc.nextLine();
    for (int i=0; i<chuoi.length(); i++)
    {
        if (chuoi.charAt(i)>=48 && chuoi.charAt(i)<=57)
            dem1 +=1;
        if (chuoi.charAt(i)>=65 && chuoi.charAt(i)<=90)
            dem2 +=1;
        if (chuoi.charAt(i)>=97 && chuoi.charAt(i)<=122)
            dem3 +=1;                 
    }   
    System.out.println("So chu viet hoa: " +dem2);
    System.out.println("So chu viet thuong: " +dem3);
    System.out.println("So chu so: " +dem1);
}
}