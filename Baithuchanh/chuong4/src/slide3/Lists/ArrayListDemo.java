package slide3.Lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
     public static void main (String[] args)
     { 
       Scanner sc = new Scanner(System.in); 
       System.out.print(" n = ");
       int n = sc.nextInt(); 
       Student a = new Student();
       ArrayList<Student> b = new ArrayList<Student>(n);
       for(int i=0; i<b.size(); i++)
       {
        System.out.println(" nhap phan tu thu "+i+" : ");
           b.add(i, a);
           a.nhapTT();
       }  

     }
}
