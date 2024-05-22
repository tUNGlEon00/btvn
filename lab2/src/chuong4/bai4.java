package chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        HashSet<String> traiCay = new HashSet<>();
        String TenCacLoaiTraiCay;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so luong cac loai trai cay");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten cac loai trai cay : ");
        for(int i = 0; i < n;i++){
        TenCacLoaiTraiCay = sc.nextLine();
        traiCay.add(TenCacLoaiTraiCay);
        }
        System.out.println("So phan tu : "+ traiCay.size());

        System.out.print("Nhập tên loại trái cây cần kiểm tra: ");
        String loaiTraiCayCanTim = sc.nextLine();
        if (traiCay.contains(loaiTraiCayCanTim)) {
            System.out.println("Tìm thấy loại trái cây trong HashSet.");
        } else {
            System.out.println("Không tìm thấy loại trái cây trong HashSet.");
        }

         // Xóa một loại trái cây bất kỳ từ HashSet
         System.out.print("Nhập tên loại trái cây cần xóa: ");
         String loaiTraiCayCanXoa = sc.nextLine();
        if (traiCay.contains(loaiTraiCayCanXoa)) {
            traiCay.remove(loaiTraiCayCanXoa);
            System.out.println("Đã xóa loại trái cây: " + loaiTraiCayCanXoa);
        } else {
            System.out.println("Không có loại trái cây để xóa.");
        }

        // Hiển thị các phần tử còn lại trong HashSet
        System.out.println("Các phần tử còn lại trong HashSet:");
        for (String fruit : traiCay) {
            System.out.println(fruit);
        }
    }
    }