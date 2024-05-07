import java.util.Scanner;
public class ptbac1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double nghiem;
        
        if (a==0)
        {
            if(b==0)
            {
                System.out.println("\npt co vo so nghiem\n");
            } else 
            {
                System.out.println("\npt vo nghiem\n");
            }
            
        } else
        {
            nghiem= -b/a;
            System.out.println("nghiem cua pt la : x= "+ nghiem);
        }
    }

}
