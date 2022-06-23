package com.huybnm2008110178;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HangHoaDienMay extends HangHoa implements VAT, DanhGia, Serializable {
    Scanner scanner = new Scanner(System.in);
    private int thoiGianBaoHanh, congSuat;
    public HangHoaDienMay(){
        super();
    }

    public HangHoaDienMay(String maHangHoa, String tenHangHoa, int soLuongTon, double donGia, int thoiGianBaoHanh, int congSuat){
        super(maHangHoa, tenHangHoa, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;

    }

    public int getThoiGianBaoHanh(){
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaohanhSua){
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat(){
        return congSuat;
    }

    public void setCongSuat(int congSuat){
        this.congSuat = congSuat;
    }

    public boolean kiemTraBaoHanh(boolean kt){
        if(this.getThoiGianBaoHanh() <= 0){
            System.out.println("thời gian bảo hành phải >= 0(tháng) ");
        }else{
            kt = false;
        }
        return kt;
    }

    public boolean kiemTraCongSuat(boolean kt){
        if(this.getCongSuat() < 0){
            System.out.println("Công suất phải >= 0(KW) ");
        }else{
            kt = false;
        }
        return kt;
    }

    public void nhap(){
        super.nhap();

        boolean ktBaoHanh = true;
        boolean ktCongSuat = true;

        do{
            System.out.println("thời gian bảo hành: ");
            thoiGianBaoHanh = scanner.nextInt();
            scanner.nextLine();
        }while(kiemTraBaoHanh(ktBaoHanh));

        do{
            System.out.println("Công suất: ");
            congSuat = scanner.nextInt();
            scanner.nextLine();
        }while(kiemTraCongSuat(ktCongSuat));
    }    

    @Override
    public double VAT(){
        double VAT = getDonGia()*0.1;
        return VAT;
    }

    @Override
    public String danhGia(){
        String danhGia;
        if(getSoLuongTon() < 3){
            danhGia = "bán được ";
        }else{
            danhGia = "";
        }
        return danhGia;
    }

    @Override
    public String toString(){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String stringVAT = numberFormat.format(VAT());
        return super.toString()+", TG bảo hành: "+thoiGianBaoHanh+"tháng"+", Công suất: "+congSuat+"KW"+", VAT: "+stringVAT+", Đánh giá: "+danhGia();
    }


    
}
