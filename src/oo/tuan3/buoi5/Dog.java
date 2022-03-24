package oo.tuan3.buoi5;

import oo.tuan5.buoi9.Animal;

public class Dog extends Animal {

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

    @Override
    protected void makeNoise() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void eat() {
        // TODO Auto-generated method stub
        
    }
    
}
