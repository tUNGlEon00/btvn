package chuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai5 {
    private String maSV;
    private String hoTen;
    private String lop;

    public bai5(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, bai5> danhSachSinhVien = new HashMap<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            bai5 sv = new bai5(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sv);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (Map.Entry<String, bai5> entry : danhSachSinhVien.entrySet()) {
            System.out.println("Mã SV: " + entry.getKey() + ", Họ tên: " + entry.getValue().getHoTen() + ", Lớp: " + entry.getValue().getLop());
        }
        System.out.print("\nNhập tên lớp cần hiển thị sinh viên: ");
        String lopCanHienThi = scanner.nextLine();

        // Hiển thị sinh viên thuộc lớp đã nhập
        System.out.println("\nNhững sinh viên thuộc lớp " + lopCanHienThi + ":");
        for (Map.Entry<String, bai5> entry : danhSachSinhVien.entrySet()) {
            if (entry.getValue().getLop().equalsIgnoreCase(lopCanHienThi)) {
                System.out.println("Mã SV: " + entry.getKey() + ", Họ tên: " + entry.getValue().getHoTen() + ", Lớp: " + entry.getValue().getLop());
            }
    }

     // Nhập mã sinh viên cần hiển thị thông tin
     System.out.print("\nNhập mã sinh viên cần hiển thị thông tin: ");
     String maSVCanTim = scanner.nextLine();

     // Hiển thị thông tin sinh viên tương ứng với mã sinh viên đã nhập
     bai5 svCanTim = danhSachSinhVien.get(maSVCanTim);
     if (svCanTim != null) {
         System.out.println("\nThông tin sinh viên có mã " + maSVCanTim + ":");
         System.out.println("Họ tên: " + svCanTim.getHoTen());
         System.out.println("Lớp: " + svCanTim.getLop());
     } else {
         System.out.println("Không tìm thấy sinh viên có mã " + maSVCanTim);
     }

    }
}