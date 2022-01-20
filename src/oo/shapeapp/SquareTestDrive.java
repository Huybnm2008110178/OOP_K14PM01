package oo.shapeapp;

public class SquareTestDrive {
    public static void main(String[] args){
        Square square = new Square("springSquareMusic.aif");

        square.rotate();

        Circle circle = new Circle("summerCircle.aif");
        circle.rotate();
    }
    
}
