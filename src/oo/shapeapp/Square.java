package oo.shapeapp;

public class Square {
    
    //attribute
    String soundFile; //Xuân - Hạ - Thu - Đông

    //method
    public Square(String soundFile){
        this.soundFile = soundFile;
        
    }

    void rotate(){

        System.out.println("Rotating 360 ...");
        this.playSound();

    }

    void playSound(){

        System.out.println("Play file" + this.soundFile + " music ");
    }
}
