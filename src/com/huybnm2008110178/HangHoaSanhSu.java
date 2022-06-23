package com.huybnm2008110178;

import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class HangHoaSanhSu extends HangHoa implements VAT, DanhGia {
    Scanner scanner = new Scanner(System.in);

    private String nhaSanXuat;
    private Date ngayNhapKhau;
    //private double VAT;
    Calendar calendar = Calendar.getInstance();

    public HangHoaSanhSu(){
        super();
    }
    
    public HangHoaSanhSu(String maHangHoa, String tenHangHoa, int soLuongTon, double donGia, Date ngayNhapKhau, String nhaSanXuat){
        super(maHangHoa, tenHangHoa, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKhau = ngayNhapKhau;
    }

    public String getnhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNgaySanXuat(String nhaSanXuat) {
        nhaSanXuat = nhaSanXuat;
    }

    public Date getNgayNhapKhau() {
        return ngayNhapKhau;
    }
    public void setNgayNhapKhau(java.util.Date ngayNhapKhauSua) {
        ngayNhapKhauSua = ngayNhapKhauSua;
    }

    public Date setStringNgayNhapKhau(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayNhapKhau = (Date) calendar.getTime();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        return ngayNhapKhau;
    }
    
    public void nhap(){
        super.nhap();
        System.out.print("Nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Ngày nhập kho: ");
        setStringNgayNhapKhau(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    
    @Override
    public double VAT() {
        double VAT = getDonGia()*0.1;
        return VAT;
    }

    public long ktDate(){
        long starValue = ngayNhapKhau.getTime();
        long endDate = Calendar.getInstance().getTimeInMillis();
        long tmp = Math.abs(starValue - endDate);

        long kq = tmp/(24*60*60*1000);

        return kq;
    }

    @Override
    public String danhGia() {
        String danhgia;
        if (getSoLuongTon() > 50 && ktDate() > 10 ){
            
            danhgia = "Bán chậm!";
        }
        else{
            danhgia="";
        }
        return danhgia;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strNNK = simpleDateFormat.format(ngayNhapKhau);

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String strVAT = numberFormat.format(VAT());

        return super.toString()+", nhàSX: "+nhaSanXuat+", HSD: "+strNNK+", VAT: "+strVAT+", Đánh giá: "+danhGia();
    }
    
}
