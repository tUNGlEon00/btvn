import java.util.Scanner;
public class bai12slide97 {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int m, n;
    do
    { 
       System.out.print(" nhap so cot: ");
       m=sc.nextInt();
    }while(m<=0);
    do
    { 
       System.out.print(" nhap so hang: ");
       n=sc.nextInt();
    }while(n<=0);
    int A[][]=new int [m][n];
    System.out.println(" nhap so lieu cho mang: ");
    for(int i=0; i<m; i++)
      for(int j=0; j<n; j++)
      {
        System.out.print("A["+i+"]["+j+"]=");
        A[i][j]=sc.nextInt();
      }
      int Max=A[0][0];
      for(int i=0; i<m; i++)
        for(int j=0; j<n; j++) 
         if (A[i][j]>Max)
          Max=A[i][j];
    System.out.print(" so lon nhat cua mang la: "+Max);      
}
}
