package oo.tuan3.buoi5;

public class IntSquare {

    private double squareValue;//implementation

    //interface
    public double getSquareOperator(int value){
        //implementation - thuật toán
        this.squareValue = Math.pow(value, 2);//operator X
        return this.squareValue;
    }
    
}
