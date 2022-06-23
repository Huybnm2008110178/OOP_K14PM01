package kiemtragiuaky;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    public GiaoDichDat(){
        super();
    }

    public GiaoDichDat(String loaiDat){
        super();
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat){
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat){
        this.loaiDat = loaiDat;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập loại đất: ");
        loaiDat = scanner.nextLine();
    }

    @Override
    public String toString(){
        return super.toString() + ", loại đất: " + this.loaiDat;
    }

    public String getNgayGiaoDich() {
        return null;
    }

    
}
