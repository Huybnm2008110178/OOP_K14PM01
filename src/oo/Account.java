package oo;

import java.util.Scanner;

public class Account {

    Scanner input = new Scanner(System.in);

    //data
    int account_number = 12345;
    int account_balance = 0;

    //function

    void withdraw(){
        System.out.print("Nhập vào số tiền cần rút?");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount; //thao tác lên data
        //account_balance = account_balance - withdrawAmount

    }
    
    void deposit(){
        //gửi tiền: deposit
        System.out.print("Nhập vào số tiền gửi");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount; //thao tác lên data

    }

    void show(){
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }
    

}
