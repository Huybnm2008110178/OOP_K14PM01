package com.huybnm2008110178;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConsoleInput {
    public Scanner scanner1 = new Scanner(System.in);
    public Scanner scanner2 = new Scanner(System.in);
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
    private int soLuongTon;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    protected int tgBaoHanh;
    private Date ngayNhapKho;

    public HangHoa nhap() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhập mã hàng:");
        String maHang = scanner1.nextLine();
        System.out.println("Nhập tên hàng:");
        String tenHang = scanner1.nextLine();
        System.out.println("Nhập số lượng tồn kho");
        try {
            soLuongTon = scanner2.nextInt();
        } catch (Exception e) {
            scanner2 = new Scanner(System.in);
            System.out.println("Nhập số:");
            e.printStackTrace();
        }

        
        System.out.println("Nhập đơn giá: ");
        try {
            donGia = scanner2.nextDouble();
        } catch (Exception e) {
            scanner2 = new Scanner(System.in);
            System.out.println("Nhập số");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Nhập ngày sản xuất:");
            Date ngaySanXuat=null;
            Date ngayHetHan=null;
            try {
                ngaySanXuat = (Date) ngayVN.parse(scanner1.nextLine()); 
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy");
                e.printStackTrace();
            }
            System.out.println("Nhập ngày hết hạn: ");
            try {
                ngayHetHan = (Date) ngayVN.parse(scanner1.nextLine());
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy");
                e.printStackTrace();
            }
            System.out.println("Nhập nhà sản xuất");
            String nhaSanXuat = scanner1.nextLine();
            hangHoa = new HangHoaThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Nhập thời gian bảo hành:");
            int thoiGianBaoHanh = 0;
            try {
                thoiGianBaoHanh = scanner2.nextInt();
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy !");
                e.printStackTrace();
            }
            System.out.println("Nhập công suất:");
            int congSuat = scanner2.nextInt();
            hangHoa = new HangHoaDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = scanner1.nextLine();
            System.out.println("Nhập ngày nhập kho:");
            Date ngayNhapKho = null;
            try {
                ngayNhapKho = (Date) ngayVN.parse(scanner1.nextLine());
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            hangHoa = new HangHoaSanhSu();
        }

        return hangHoa;
    }

    public HangHoa suaHangHoa() throws ParseException {
        HangHoa hangHoa = null;
        System.out.println("Nhập mã hàng:");
        String maHang = scanner1.nextLine();
        System.out.println("Nhập tên hàng:");
        String tenHang = scanner1.nextLine();
        System.out.println("Nhập số lượng tồn kho");
        try {
            soLuongTon = scanner2.nextInt();
        } catch (Exception e) {
            scanner2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        
        System.out.println("Nhập đơn giá: ");
        try {
            donGia = scanner2.nextDouble();
        } catch (Exception e) {
            scanner2 = new Scanner(System.in);
            System.out.println("Nhập số!!!");
            e.printStackTrace();
        }

        if (maHang.contains("T")) {
            System.out.println("Nhập ngày sản xuất:");
            try {
                Date ngaySanXuat = (Date) ngayVN.parse(scanner1.nextLine()); 
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhập ngày hết hạn: ");
            try {
                Date ngayHetHang = (Date) ngayVN.parse(scanner1.nextLine());
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            System.out.println("Nhà sản xuất");
            String nhaSanXuat = scanner1.nextLine();
            hangHoa = new HangHoaThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaSanXuat);

        } else if (maHang.contains("D")) {
            System.out.println("Nhập thời gian bảo hành:");
            int thoiGianBaoHanh = 0;
            try {
                thoiGianBaoHanh = scanner2.nextInt();
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhap dd/mm/yyyy !");
                e.printStackTrace();
            }
            System.out.println("Nhập công suất:");
            int congSuat = scanner2.nextInt();
            hangHoa = new HangHoaDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);

        } else if (maHang.contains("S")) {
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = scanner1.nextLine();
            System.out.println("Nhập ngày nhập kho:");
            try {
                Date ngayNhapKho = (Date) ngayVN.parse(scanner1.nextLine());
            } catch (Exception e) {
                scanner2 = new Scanner(System.in);
                System.out.println("Nhập dd/mm/yyyy!");
                e.printStackTrace();
            }
            hangHoa = new HangHoaSanhSu();
        }

        return hangHoa;
    }
    
}
