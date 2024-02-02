import java.util.Scanner;
public class bai11slide97 {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n;
    do{
        System.out.print(" nhap vao so phan tu cua mang: ");
        n=sc.nextInt();
    }while(n<=0);
    int A[]=new int[n];
    System.out.println(" nhap so lieu cho mang: ");
    for (int i=0; i<n; i++)
    {
        System.out.print(" nhap phan tu thu "+i+" : ");
        A[i]=sc.nextInt();
    } 
    System.out.println(" mang vua khoi tao la: ");
    for (int i=0; i<n; i++)
        System.out.print(" "+A[i]+" " );
        System.out.print("\n");
    int temp;    
    for (int i=0; i<n-1; i++)
      for (int j=i+1; j<n; j++)
        if(A[i]>A[j])
          {temp=A[i];
          A[i]=A[j];
          A[j]=temp;}
    System.out.println(" mang sau khi sap xep tang dan la: ");
    for (int i=0; i<n; i++)
    System.out.print(" "+A[i]+" " );
}
}
