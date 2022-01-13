package oo;

import java.util.Scanner;

public class Customer {
    int CustomerID;
    String Name, Address;

    Scanner input = new Scanner(System.in);

    void NhapThongTin(){
        System.out.println("Nhập ID: ");
        CustomerID = input.nextInt();
        System.out.println("Nhập tên: ");
        Name = input.nextLine();
        System.out.println("Nhập địa chỉ: ");
        Address = input.nextLine();

    }

    void InThongTin(){
        System.out.println("Thông tin khách hàng");
        System.out.println("Account ID: " + CustomerID);
        System.out.println("Account Name: " + Name);
        System.out.println("Account Address: " + Address);

    }

    
}
