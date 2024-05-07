import java.util.Scanner;

public class Slide27 {
    float cv;
    float dientich;
    float bankinh;
    final float PI = 3.14f;

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    public void tinhDienTich () {
        dientich = PI * bankinh * bankinh;
    }

    public float getBankinh () {
        return bankinh;
    }

    public float tinhChuVi () {
        cv = 2 * PI * bankinh ;
        return cv;
    }

   Boolean voongTronLon () {
    if( bankinh > 10) {
        return true;
    }else {
        return false;
    }
   } 

   public static void main(String[] args) throws Exception {
    Slide27 A = new Slide27();
    A.nhapGiaTri();
    if(A.voongTronLon()){
        System.out.println("hinh tron ca ban kinh " + A.getBankinh());
    }else{
        float chuvi = A.tinhChuVi();
        System.out.println("chu vi hinh tron la" + chuvi);
    }
    
}
}
