package kiemtragiuaky;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private int luaChon;

    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(String loaiNha, String diaChi){
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha(){
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha){
        this.loaiNha = loaiNha;
    }

    public String getDiaChi(){
        return diaChi;
    }

    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhập loại nhà: ");
        luaChon = scanner.nextInt();
        switch(luaChon){
            case 0: 
                loaiNha = "cao cấp";
                break;
            case 1:
                loaiNha = "thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ.");
        }

    }

    @Override
    public String toString(){
        return super.toString() + ", loại nhà: " + this.loaiNha + ", địa chỉ: " + this.diaChi;
    }

    public String getNgayGiaoDich() {
        return null;
    }

    
}
