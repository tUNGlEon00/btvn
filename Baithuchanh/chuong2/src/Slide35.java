import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(" so thu nhat: ");
        Double so1 = sc.nextDouble();
        System.out.print(" so thu 2 la: ");
        Double so2 = sc.nextDouble();
        Double min = so1;
        if (min > so2)
        min=so2;
        System.out.print(" so nho nhat cua 2 so la: "+ min);
    }

    
}
