import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    
    int m, n;
    do{
        System.out.print(" nhap so hang cua ma tran: ");
        m = sc.nextInt();
      }while(m<=0);
    do{    
        System.out.print(" nhap so cot cua ma tran: ");
        n = sc.nextInt();
      }while (n<=0);
    int [][]A= new int[n][m];
    System.out.println (" nhap du lieu cho mang: ");
    for(int i=0; i<n; i++)
      for(int j=0; j<m; j++)
      {
        System.out.print("A["+i+"]["+j+"]=");
        A[i][j]=sc.nextInt();
      }
      int Max=A[0][0];
    for(int i=0; i<n; i++)
       for(int j=0; j<m; j++)
        if (A[i][j]>Max)
        Max=A[i][j];
       System.out.print(" so lon nhat cua ma tran la: "+Max);
}
}
