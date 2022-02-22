package oo.tuan3.buoi5;

public class Dog {

    //attribute - data
    private int size; //implementation
    /**default */ String name;//interface
    /**default */ String breed;//interface

    //methods
    //interface
    public void setSize(int Size){
        //viết code để ràng buộc size không bao giờ được âm
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Size unvalid (không hợp lệ)!!");
        }
    }
    
    //interface
    public int getSize(){
        return this.size;
    }
    
}
