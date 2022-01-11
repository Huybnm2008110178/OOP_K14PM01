package structured;

import java.util.Scanner;

public class BankStructured {
    //toàn cục: global
    static int account_number = 12345;
        static int account_balance = 0;
        static Scanner input;
        

        //data Employee
        static String emName; //ten nhan vien
        static double salary; //luong

        //data Customer
        static String cusName; //ten khach
        static String address; //dia chi
    public static void main(String[] args){
        //data:
        //khai bao 2 bien local cuc bo
        //data Employee
        //data Customer
        //hanh dong thao tac len data

        
        input = new Scanner(System.in);

        //show
        show(); //make function call
        deposit();
        withdraw();

    }

    static void withdraw(){
        System.out.print("Nhập vào số tiền cần rút?");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount; //thao tác lên data
        //account_balance = account_balance - withdrawAmount

    }

    static void deposit(){
        //gửi tiền: deposit
        System.out.print("Nhập vào số tiền gửi");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount; //thao tác lên data

    }

    static void show(){
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }
    
    static void getEmName(){
        emName = "";
        cusName = "ABC"; //khong duoc quyen dung chamden du lieu cua Customer

    }

    static void getSalary(){
        salary = 500;

    }

    static String getCusInfo(){//khach hang customer
        account_balance = 0; //vo tinh hay co y thao tac ten du lieu ma dang le function khong duoc/nen dung cham den cai data do
        return cusName + address;

    }
}
