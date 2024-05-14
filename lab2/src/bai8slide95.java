import java.util.Scanner;

public class bai8slide95 {
    public static void main(String[] args) throws Exception {
        int n;
        int s=0;
        Scanner sc= new Scanner(System.in);
        do {
        System.out.print("So phan tu cua mang la: ");
        n=sc.nextInt();
           }while(n<=0); 
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Phan tu thu " +i+" cua mang la: ");
            A[i]=sc.nextInt();

                s+=A[i];
            
        }
         double tbc = (double)s/n;
        System.out.print("Trung binh cong cac so trong mang la: "+tbc);
}
}
