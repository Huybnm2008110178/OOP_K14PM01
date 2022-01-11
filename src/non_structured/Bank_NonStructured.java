package non_structured;

import java.util.Scanner;

public class Bank_NonStructured {
    public static void main(String[] args){

        //data
        //khai báo 2 biến
        int account_number = 12345;
        int account_balance = 0;
        //data Employee

        //data Customer

        //hành động thao tác lên data
        Scanner input;
        input = new Scanner(System.in);

        //gửi tiền: deposit
        System.out.print("Nhập vào số tiền gửi");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount; //thao tác lên data
        
        //show
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //rút tiền; withdraw
        System.out.print("Nhập vào số tiền cần rút?");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount; //thao tác lên data
        //account_balance = account_balance - withdrawAmount
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //rút tiền; withdraw
        System.out.print("Nhập vào số tiền cần rút?");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount; //thao tác lên data
        //account_balance = account_balance - withdrawAmount
        //show
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //rút tiền; withdraw
        System.out.print("Nhập vào số tiền cần rút?");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount; //thao tác lên data
        //account_balance = account_balance - withdrawAmount
        //show
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //Employee: hành động thao tác lên data của Employee

        //Customer: hành động thao tác lên data của Customer

    }
    
}
