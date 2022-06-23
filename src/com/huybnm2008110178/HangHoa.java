package com.huybnm2008110178;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class HangHoa {
    protected String maHangHoa;
    protected String tenHangHoa;
    protected int soLuongTon;
    private double donGia, tongSoTien;
    Scanner scanner = new Scanner(System.in);

    public HangHoa(String maHangHoa2, String tenHangHoa2, int soLuongTon2, double donGia2){
        super();
    }

    public HangHoa(){
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.tongSoTien = tongSoTien;

    }

    public String getmaHangHoa(){
        return maHangHoa;
        
    }

    public void setmaHangHoa(String maHangHoa){
        this.maHangHoa = maHangHoa;
    }

    public String getTenHangHoa(){
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa){
        this.tenHangHoa = tenHangHoa;
    }

    public int getSoLuongTon(){
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon){
        this.soLuongTon = soLuongTon;
    }

    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public double getDonGia(){
        return donGia;
    }

    public double getTongSoTien(){
        return tongSoTien;
    }

    public void setTongSoTien(double tongSoTien){
        this.tongSoTien = tongSoTien;
    }

    public boolean kiemTraMaHang(boolean kt){
        if(this.maHangHoa == "" || this.maHangHoa.trim().isEmpty()){
            System.out.println("Mã hàng hóa không được để trống ");
        }else{
            kt = false;
        }
        return kt;

    }

    public boolean kiemTraTenHang(boolean kt){
        if(this.tenHangHoa == "" || this.tenHangHoa.trim().isEmpty()){
            System.out.println("Tên hàng hóa không được đễ trống ");
        }else{
            kt = false;
        }
        return kt;
    }

    public boolean kiemTraSoLuongTon(boolean kt){
        if(this.soLuongTon < 0){
            System.out.println("Số lượng tồn phải lớn hơn 0 ");
        }else{
            kt = false;
        }
        return kt;
    }

    public boolean kiemTraDonGia(boolean kt){
        if(this.donGia <= 0){
            System.out.println("Đơn giá phải lớn hơn 0 ");
        }else{
            kt = false;
        }
        return kt;
    }

    public void nhap(){
        boolean ktMaHang = true;
        boolean ktTenHang = true;
        boolean ktSoLuongTon = true;
        boolean ktDonGia = true;

        do{
            System.out.print("Mã hàng hóa: ");
            setmaHangHoa(scanner.nextLine());
        }while(kiemTraMaHang(ktMaHang));

        do{
            System.out.print("Tên hàng hóa: ");
            setTenHangHoa(scanner.nextLine());
        }while(kiemTraTenHang(ktTenHang));

        do{
            System.out.println("Số lượng tồn: ");
            setSoLuongTon(scanner.nextInt());
        }while(kiemTraSoLuongTon(ktSoLuongTon));

        do{
            System.out.print("Đơn giá: ");
            setDonGia(scanner.nextDouble());
            scanner.nextLine();
        }while(kiemTraDonGia(ktDonGia));
    }

    @Override
    public String toString(){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String stringDonGia = numberFormat.format(donGia);
        return "Mã hàng: "+maHangHoa+", Tên hàng: "+tenHangHoa+", Số lượng tồn: "+soLuongTon+", Đơn giá: "+stringDonGia;
    }

    public String inTongSoTien(){
        tongSoTien = donGia*soLuongTon;

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String stringDonGia = numberFormat.format(donGia);
        String stringTongSoTien =  numberFormat.format(tongSoTien);
        
        return "Mã hàng: "+maHangHoa+", Tên hàng: "+tenHangHoa+", Số lượng tồn: "+soLuongTon+", Đơn giá: "+stringDonGia+", Tổng số tiền "+stringTongSoTien;
        
    }



    
    
}
