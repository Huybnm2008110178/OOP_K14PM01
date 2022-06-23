package com.huybnm2008110178;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ListHangHoa extends HangHoa {
    List<HangHoaThucPham> listTP = new ArrayList<>();
    List<HangHoaDienMay> listDM = new ArrayList<>();
    List<HangHoaSanhSu> listSS = new ArrayList<>();

    List<HangHoa> list = new ArrayList<>();
    
    HangHoaThucPham hhtp = new HangHoaThucPham();
    HangHoaDienMay hhdm = new HangHoaDienMay();
    HangHoaSanhSu hhss = new HangHoaSanhSu();
    
    public void readyList() {
        listTP.add(new HangHoaThucPham("TP1", "Bánh mì", 10, 2000, hhtp.setStringNgaySanXuat(2022, 3, 18), hhtp.setStringHanSuDung(2022, 4, 20), "tiệm bánh ABC"));
        listTP.add(new HangHoaThucPham("TP2", "Rau", 50, 3000, hhtp.setStringNgaySanXuat(2022, 2, 20), hhtp.setStringHanSuDung(2022, 5, 5), "tiệm rau"));
        listTP.add(new HangHoaThucPham("TP3", "Thịt", 10, 12000, hhtp.setStringNgaySanXuat(2022, 3, 25), hhtp.setStringHanSuDung(2022, 5, 30), "tiệm thịt"));
        listTP.add(new HangHoaThucPham("TP4", "Khoai tây chiên", 20, 50000, hhtp.setStringNgaySanXuat(2022, 4, 25), hhtp.setStringHanSuDung(2022, 4, 20), "Pizza hut"));
        listDM.add(new HangHoaDienMay("DM1", "Tủ lạnh", 20, 20000000, 4, 20));
        listDM.add(new HangHoaDienMay("DM2", "Điện thoại", 50, 5000000, 3, 10));
        listDM.add(new HangHoaDienMay("DM3", "Laptop", 15, 15000000, 2, 20));
        listSS.add(new HangHoaSanhSu("SS1", "Bình gốm", 20, 1500000, hhss.setStringNgayNhapKhau(2022, 2, 12), "Cửa hàng"));
        listSS.add(new HangHoaSanhSu("SS2", "Chén", 25, 50000, hhss.setStringNgayNhapKhau(2022, 30, 1), "Cửa hàng"));
        listSS.add(new HangHoaSanhSu("SS3", "Ly thủy tinh", 50, 250000, hhss.setStringNgayNhapKhau(2022, 3, 13), "Cửa hàng"));
        
        list.addAll(listTP);
        list.addAll(listDM);
        list.addAll(listSS);        
    }

    public int timID(){
        System.out.print("Nhập mã hàng hóa: ");
        String timID = scanner.nextLine();

        int x = -1;        
            for (HangHoa HangHoa : list) {
                if(timID.equalsIgnoreCase(HangHoa.getmaHangHoa())){
                    x = list.indexOf(HangHoa);
                }
            }
        return x;
    } 
    
    public Double sumGia(){
        double sumThucPham = 0;
        for (HangHoa hangHoa : list) {
            sumThucPham = hangHoa.getDonGia()*getSoLuongTon(); 
        }
        return sumThucPham;
    }
    
    public void Add(HangHoa hangHoa){
                int luaChon2;
                System.out.println("-> 1. Hàng thực phẩm");
                System.out.println("-> 2. Hàng điện máy");
                System.out.println("-> 3. Hàng sành sứ");
                System.out.print("Chọn loại hàng: ");
                luaChon2 = scanner.nextInt();
                if(luaChon2 == 1){
                    HangHoaThucPham hhtp = new HangHoaThucPham();
                    hhtp.nhap();
                    list.add(new HangHoaThucPham(hhtp.getmaHangHoa(), hhtp.getTenHangHoa(), hhtp.getSoLuongTon(), hhtp.getDonGia(), hhtp.getNgaySanXuat(), hhtp.getHanSuDung(), hhtp.getNhaCungcap()));
                }
                if(luaChon2 == 2){
                    HangHoaDienMay hdm = new HangHoaDienMay();
                    hhdm.nhap();
                    list.add(new HangHoaDienMay(hhdm.getmaHangHoa(), hhdm.getTenHangHoa(), hhdm.getSoLuongTon(), hhdm.getDonGia(), hhdm.getThoiGianBaoHanh(), hhdm.getCongSuat()));
                }
                if(luaChon2== 2){
                    HangHoaSanhSu hhss = new HangHoaSanhSu();
                    hhss.nhap();
                    list.add(new HangHoaSanhSu(hhss.getmaHangHoa(), hhss.getTenHangHoa(), hhss.getSoLuongTon(), hhss.getDonGia(), hhss.getNgayNhapKhau(), hhss.getnhaSanXuat()));
                }
                System.out.println("Thêm hàng hóa thành công!");
                scanner.nextLine();
    }
    
    public void Remove(){
        int x = timID();
        if(x != -1){
            list.remove(x);
            System.out.println("Xóa hàng hóa thành công");
        }
        else{
            System.out.println("Mã hàng không hợp lệ!!");
        }
        scanner.nextLine();
    }
    public void Update(){
        System.out.print("Nhập mã hàng cần sửa: ");
        String timID2 = scanner.nextLine();

        int x = -1;

        for (HangHoa HangHoaFix : list) {
            if(timID2.equalsIgnoreCase(HangHoaFix.getmaHangHoa())){
                x = list.indexOf(HangHoaFix);
            }
        }
        for (int j = 0; j < list.size(); j++){
            if(j == x ){
                System.out.println("Mã hàng: "+timID2);
                System.out.print("Tên hàng muốn sửa: ");
                String tenHangHóaSua = scanner.nextLine();
                System.out.print("Số lượng tồn muốn sửa: ");
                int soLuongTonSua = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Đơn giá muốn sửa: ");
                double donGiaSua = scanner.nextDouble();
                scanner.nextLine();

                listTP.get(j).setmaHangHoa(maHangHoa);
                listTP.get(j).setTenHangHoa(tenHangHoa);
                listTP.get(j).setDonGia(donGiaSua);
                listTP.get(j).setSoLuongTon(soLuongTonSua);

                if( timID2.substring(0, 2).equalsIgnoreCase("Thực phẩm")){
                    
                        System.out.print("Ngày sản xuất muốn sửa: ");
                        Date NgaySanXuatSua = hhtp.setStringNgaySanXuat(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Hạn sử dụng muốn sửa: ");
                        Date HanSuDungSua = hhtp.setStringHanSuDung(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Nhà cung cấp muốn sửa: ");
                        String nhaCungcapSua = scanner.nextLine();
                        
                        listTP.get(j).setNgaySanXuat(NgaySanXuatSua);
                        listTP.get(j).setHanSuDung(HanSuDungSua);
                        listTP.get(j).setNhaCungCap(nhaCungcapSua);
                    
                }

                if(timID2.substring(0, 2).equalsIgnoreCase("DM")){
                    
                        System.out.print("Thời gian bảo hành muốn sửa: ");
                        int thoiGianBaohanhSua = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Công suất muốn sửa: ");
                        int congSuatSua = scanner.nextInt();
                        scanner.nextLine();
                        
                        listDM.get(j).setThoiGianBaoHanh(thoiGianBaohanhSua);
                        listDM.get(j).setCongSuat(congSuatSua);
                    
                }

                if(timID2.substring(0, 2).equalsIgnoreCase("SS")){
                    
                        System.out.print("Nhà sản xuất muốn sửa: ");
                        String nhaSanXuatSua = scanner.nextLine();
                        System.out.print("Ngày xuất kho muốn sửa: ");
                        Date ngayNhapKhauSua = hhss.setStringNgayNhapKhau(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        scanner.nextLine();

                        listSS.get(j).setNgaySanXuat(nhaSanXuatSua);
                        listSS.get(j).setNgayNhapKhau(ngayNhapKhauSua);
                    
                }
            }
        }
        System.out.println("Sửa thông tin hàng hóa thành công "+timID2);
    }
    public void inTimID(){
        boolean k = false;
        System.out.print("Nhập mã hàng hóa: ");
        String timID = scanner.nextLine();      
            for (HangHoa HangHoa : list) {
                if(timID.equalsIgnoreCase(HangHoa.getmaHangHoa())){
                   System.out.println(HangHoa);
                   k = true;
                }
            }
            if(k == false){
                System.out.println("Mã hàng hóa không hợp lệ!!");
            }
    }
    public void inTimLoai(){
        //boolean k = false;
        System.out.println("    1/ Theo loại hàng \"Điện máy\"");
        System.out.println("    2/ Theo loại hàng \"Thực phẩm\"");
        System.out.println("    3/ Theo loại hàng \"Sành sứ\"");
        System.out.print("Chọn loại hàng: ");
        int timLoai = scanner.nextInt();  

        if(timLoai == 1){
            for (HangHoa hangHoaThucPham: listTP) {
                System.out.println(hangHoaThucPham);
            }
        }
        if(timLoai == 2){
            for (HangHoa hangHoaDienMay : listDM) {
                System.out.println(hangHoaDienMay);
            }
        }
        if(timLoai == 3){
            for (HangHoa hangHoaSanhSu : listSS) {
                System.out.println(hangHoaSanhSu);
            }
        }
    }
    public void sortGia(){
        System.out.println("    Chọn 1 để sắp xếp tăng dần ");
        System.out.println("    Chọn 2 để sắp xếp giảm dần ");
        System.out.print("Chọn cách sắp xếp: ");
        int sort = scanner.nextInt();

        if(sort == 1){  
            
            Comparator comparator = new Comparator<HangHoa>() {

                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    
                    return Double.compare(o1.getDonGia(), o2.getDonGia());
                }
                
            };
            list.sort(comparator);

            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).toString());
            }

        }

        if(sort == 2){  
            Comparator comparator = new Comparator<HangHoa>(){
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    return Double.compare(o2.getDonGia(), o1.getDonGia());
                }
            };                
            list.sort(comparator);
            
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }
    }
    public void sortNumber(){
        System.out.println("    Chọn 1 để sắp xếp tăng dần ");
        System.out.println("    Chọn 2 để sắp xếp giảm dần ");
        System.out.print("Chọn cách sắp xếp: ");
        int sort = scanner.nextInt();

        if(sort == 1){ 
            
            Comparator comparator = new Comparator<HangHoa>() {

                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    
                    return Double.compare(o1.getSoLuongTon(), o2.getSoLuongTon());
                }
                
            };
            list.sort(comparator);

            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).toString());
            }

        }

        if(sort == 2){  
            Comparator comparator = new Comparator<HangHoa>(){
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    return Double.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
                }
            };                
            list.sort(comparator);
            
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).toString());
            }
        }
    }
    
    public void thongKe(){
        //System.out.println("---Loại hàng thực phẩm---");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println("Tổng hàng hóa: "+list.size()+" hàng hóa");
    }

    public void tongGiaTri(){
        double sum = sumGia();

        for (HangHoa hangHoa : list) {
            sum += hangHoa.getDonGia();
        }

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String stringSum = numberFormat.format(sum);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).inTongSoTien());
        }

        System.out.println("Tổng giá trị của hàng hóa: "+stringSum);
    }
    public void thongKeLoai(){
        System.out.println("    1/ Theo loại hàng \"Thực phẩm\"");
        System.out.println("    2/ Theo loại hàng \"Điện máy\"");
        System.out.println("    3/ Theo loại hàng \"Sành sứ\"");
        System.out.print("Chọn loại hàng: ");
        int timLoai = scanner.nextInt();  

        if(timLoai == 1){
            for (HangHoa hangHoaThucPham : listTP) {
                System.out.println(hangHoaThucPham);
            }
            System.out.println("Tổng hàng hóa \"Thực phẩm: \""+listTP.size()+" hàng hóa");
        }

        if(timLoai == 2){
            for (HangHoa hangHoaDienMay : listDM) {
                System.out.println(hangHoaDienMay);
            }
            System.out.println("Tổng hàng hóa \"Điện máy: \""+listDM.size()+" hàng hóa");

        }

        if(timLoai == 3){
            for (HangHoa hangHoaSanhSu: listSS) {
                System.out.println(hangHoaSanhSu);
            }
            System.out.println("Tổng hàng hóa \"Sành sứ: \""+listDM.size()+" hàng hóa");

        }
    }
    
}
