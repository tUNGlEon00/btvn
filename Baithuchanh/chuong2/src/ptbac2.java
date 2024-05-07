
import java.util.Scanner;
public class ptbac2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      Double a = sc.nextDouble();
      Double b = sc.nextDouble();
      Double c = sc.nextDouble();
      Double delta, x1, x2;
      delta = b*b - 4*a*c;
      if (delta<0) 
           System.out.println(" pt vo nghiem ");
      else if (delta == 0){
           x1=x2= -b/(2*a);
           System.out.println("pt co nghiem kep x =" + x1);
                          }
      else 
      {
          x1= (-b - Math.sqrt(delta))/(2*a);
          x2= (-b + Math.sqrt(delta))/(2*a);
          System.out.println(" pt co 2 nghiem phan biet: " );
          System.out.println( "x1 = " + x1);
          System.out.println( "x2 = " + x2);
      }  sc.close();                      

}
}
