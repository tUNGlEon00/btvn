package chuong4;

import java.util.ArrayList;
import java.util.Scanner;



public class bai3 {

    public static void main(String[] args) {    ArrayList<DanhSachDV> arrayList = new ArrayList<DanhSachDV>();
    int n;
    String tenCanTim;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so luong phan tu cua mang ");
    n = sc.nextInt();


    for(int i = 0; i < n; i++) {
        DanhSachDV ps = new DanhSachDV();
        System.out.println("Nhập thông tin sinh viên " + (i+1) + ":");
        ps.nhapGiaTri();
        
        if (ps.getHoTen().isEmpty()) {
            break; // Dừng khi người dùng nhập chuỗi rỗng
        }
        
        arrayList.add(ps);
    }


    for(int i = 0; i <  arrayList.size();i++){
        System.out.println("<------duoc in ra la ----->");
        arrayList.get(i).inGiaTri();

    }


    System.out.println("Thêm thông tin sinh viên mới:");
    DanhSachDV svMoi = new DanhSachDV();
    svMoi.nhapGiaTri();
    arrayList.add(svMoi);

    int soSinhVienThiLai = 0;
    // In thông tin của các sinh viên sau khi thêm
    System.out.println("Thông tin của các sinh viên sau khi thêm:");
    for(int i = 0; i < arrayList.size(); i++) {
        System.out.println("<------ Sinh viên " + (i+1) + " ----->");
        arrayList.get(i).inGiaTri();

           // Kiểm tra nếu sinh viên phải thi lại
           if (arrayList.get(i).getDiem() <= 5) {
            soSinhVienThiLai++;
            System.out.println("Sinh viên này phải thi lại.");
        }
    }

    // Hiển thị thông tin số sinh viên phải thi lại
    System.out.println("Tổng số sinh viên phải thi lại: " + soSinhVienThiLai);

    int diemCaoNhat = Integer.MIN_VALUE; // Giả sử điểm cao nhất ban đầu là giá trị nhỏ nhất của kiểu int
    // Tìm điểm cao nhất trong danh sách sinh viên
    for (int i = 0; i < arrayList.size(); i++) {
        if (arrayList.get(i).getDiem() > diemCaoNhat) {
            diemCaoNhat = arrayList.get(i).getDiem();
        }
    }

    // In thông tin của các sinh viên có điểm cao nhất
    System.out.println("Thông tin của các sinh viên có điểm cao nhất:");
    for (int i = 0; i < arrayList.size(); i++) {
        if (arrayList.get(i).getDiem() == diemCaoNhat) {
            System.out.println("<------ Sinh viên " + (i+1) + " ----->");
            arrayList.get(i).inGiaTri();
        }
    }

    System.out.println("Nhập tên sinh viên cần tìm kiếm:");
    sc.nextLine(); 
    tenCanTim = sc.nextLine();

    boolean found = false; // Biến để kiểm tra xem có sinh viên nào được tìm thấy không
    for (int i = 0; i < arrayList.size(); i++) {
        if (arrayList.get(i).getHoTen().equalsIgnoreCase(tenCanTim)) {
            found = true;
            System.out.println("Thông tin sinh viên được tìm kiếm:");
            arrayList.get(i).inGiaTri();
        }
    }
    if (!found) {
        System.out.println("Không tìm thấy sinh viên có tên " + tenCanTim);
    }

    }
    }