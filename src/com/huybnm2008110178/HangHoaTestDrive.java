package com.huybnm2008110178;

import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) {

        ListHangHoa listHH = new ListHangHoa();
        Scanner scanner = new Scanner(System.in);

        listHH.readyList();
   
        int luaChon;

        do{
            System.out.println("=================== Menu ====================");
            System.out.println("- 1/  Nhập thêm hàng hóa                    -");
            System.out.println("- 2/  Xóa thông tin hàng hóa                -");
            System.out.println("- 3/  Sửa thông tin hàng hóa                -");
            System.out.println("- 4/  Tìm kiếm hàng hóa theo mã             -");
            System.out.println("- 5/  Tìm kiếm hàng hóa theo loại           -");
            System.out.println("- 6/  Sắp xếp hàng hóa theo giá             -");
            System.out.println("- 7/  Sắp xếp hàng hóa theo số lượng        -");
            System.out.println("- 8/  Thống kê tổng số hàng hóa             -");
            System.out.println("- 9/  Thống kê số lượng từng loại hàng hóa  -");
            System.out.println("- 10/ Thống kê giá trị tất cả hàng hóa      -");
            System.out.println("- 0/  Thoát                                 -");
            System.out.println("=============================================");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            switch (luaChon){
                case 1 :
                    listHH.Add(listHH);
                    break;

                case 2: 
                    listHH.Remove();
                    break;

                case 3:
                    listHH.Update();
                    break;

                case 4:
                    listHH.inTimID();
                    break;

                case 5:
                    listHH.inTimLoai();
                    break;

                case 6:
                    listHH.sortGia();
                    break;

                case 7:
                    listHH.sortNumber();
                    break;

                case 8 :
                    listHH.tongGiaTri();
                    break;

                case 9:
                    listHH.thongKe();
                    break;

                case 10:
                    listHH.thongKeLoai();
                    break;

                default:
                    System.out.println("Sai ");
            }
        }while(luaChon != 0);

    }
    
}
