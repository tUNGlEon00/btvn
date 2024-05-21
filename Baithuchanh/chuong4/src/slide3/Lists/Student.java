
package slide3.Lists;
import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;

    Scanner sc = new Scanner(System.in);

    public void nhapTT()
    {
     System.out.println(" Moi ban nhap thong tin: ");
     System.out.println(" Ten: ");
     FullName = sc.nextLine();
     System.out.println(" Tuoi: ");
     Age = sc.nextInt();
    }

    public void xuatTT()
    {
     System.out.println(" Thong tin cua ban la: ");
     System.out.println(" Ten: "+FullName);
     System.out.println(" Tuoi: "+Age);
    }
    
    public void themThongTin(String FullName, int Age)
    {
       this.FullName = FullName;
       this.Age = Age;
    }

    public void suaThongTin(String FullName, int Age ) {
        this.FullName = FullName;
        this.Age = Age;
    }
     public void NextL()
    {
        sc.nextLine();
    }
      

}
