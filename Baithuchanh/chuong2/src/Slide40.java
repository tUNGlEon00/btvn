import java.util.Scanner;
public class Slide40 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so ngay:");
        int Ngay = sc.nextInt();
        switch (Ngay){
            case 1 : System.out.print("Chu nhat");
            break;
            case 2 : System.out.print(" thu 2 ");
            break;
            case 3 : System.out.print(" thu 3");
            break;
            case 4 : System.out.print(" thu 4 ");
            break;
            case 5 : System.out.print(" thu 5 ");
            break;
            case 6 : System.out.print(" thu 6 ");
            break;
            case 7 : System.out.print(" thu 7 ");
            break;
            default: System.out.print("So ngay sai");
        }
    }
    
}
