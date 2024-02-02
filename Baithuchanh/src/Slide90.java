import java.util.Scanner;
public class Slide90 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String chuoi;
        System.out.println(" moi ban nhap chuoi: ");
        chuoi=sc.nextLine();
        System.out.println(" cac ki tu cua chuoi la: ");
        for(int i=0; i<chuoi.length(); i++)
        System.out.println(chuoi.charAt(i));
}
}
