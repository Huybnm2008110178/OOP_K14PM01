package com.huybnm2008110178;

import java.io.Serializable;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class HangHoaThucPham extends HangHoa implements VAT, DanhGia, Serializable {
    Scanner scanner = new Scanner(System.in);

    private Date setNgaySanXuat;

    Date hanSuDung;
    private String nhaCungcap;

    private java.util.Date ngaySanXuat;

    public HangHoaThucPham(){
        super();
    }
    
    public HangHoaThucPham(String maHangHoa, String tenHangHoa, int soLuongTon, double donGia, Date ngaySanXuat, Date hanSuDung, String nhaCungCap){
        super(maHangHoa, tenHangHoa, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung= hanSuDung;
        this.nhaCungcap = nhaCungcap;
    }

    public String getNhaCungcap() {
        return nhaCungcap;
    }
    public void setNhaCungcap(String nhaCungcap) {
        this.nhaCungcap = nhaCungcap;
    }

    public Date getNgaySanXuat() {
        return getNgaySanXuat();
    }
    public void setNgaySanXuat(java.util.Date ngaySanXuatSua) {
        this.ngaySanXuat = ngaySanXuatSua;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }
    public void setHanSuDung(java.util.Date hanSuDungSua) {
        this.hanSuDung = (Date) hanSuDungSua;
    }

    public boolean ktNgaySanXuatVaHanSuDung( boolean kt){
        if (this.getNgaySanXuat().compareTo(this.getHanSuDung()) < 0){
            kt = false;
        }else{
            System.out.println("Ngày sản xuất phải trước hạn sử dụng!!!");
        }
        return kt;
    }

    public boolean ktHanSuDung(boolean kt){
        Date today = new Date(soLuongTon);
        today.getTime();
        if (this.getHanSuDung().compareTo(today) < 0){
            System.out.println("Hết hạn");
            kt = true;
        }else{
            kt = false;
        }
        return kt;
    }

    public Date setStringNgaySanXuat(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySanXuat = calendar.getTime();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        return getNgaySanXuat();
    }

    public Date setStringHanSuDung(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hanSuDung = (Date) calendar.getTime();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        return hanSuDung();
    }


    private Date hanSuDung() {
        return null;
    }

    public void nhap(){
        super.nhap();

        boolean ktHSD = true ;
        
        do{
            System.out.print("Ngày sản xuất: ");
            setStringNgaySanXuat(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            System.out.print("Ngày hết hạn: ");
            setStringHanSuDung(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
        }while(ktNgaySanXuatVaHanSuDung(ktHSD));

        System.out.print("Nhà cung cấp: ");
        nhaCungcap = scanner.nextLine();
    }

    @Override
    public double VAT() {
        double VAT = getDonGia()*0.1;
        return VAT;
    }

    @Override
    public String danhGia() {
        String danhgia;
        if (getSoLuongTon() > 0 && ktHanSuDung(true)) {
            
            danhgia = "Khó bán";
        }
        else{
            danhgia="";
        }
        return danhgia;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String stringNgaySanXuat = simpleDateFormat.format(ngaySanXuat);
        String stringHanSuDung = simpleDateFormat.format(hanSuDung);

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String strVAT = numberFormat.format(VAT());

        return super.toString()+", Ngày sản xuất: "+stringNgaySanXuat+", Hạn sử dụng: "+stringHanSuDung+", Nhà cung cấp: "+nhaCungcap+", VAT: "+strVAT+", Đánh giá: "+danhGia();
    }

    public void setNhaCungCap(String nhaCungcapSua) {
    }

    
}
