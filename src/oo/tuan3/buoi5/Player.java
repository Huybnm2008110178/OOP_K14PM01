package oo.tuan3.buoi5;

public class Player {
    //attribute
    int number = 0;

    //method
    public void guess(){
        number = (int) (Math.random() * 10); //1-10
        System.out.println("I'm guessing" + number);
    }
}
