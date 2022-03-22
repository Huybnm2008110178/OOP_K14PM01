package oo.tuan6.buoi9;

import java.util.ArrayList;
import java.util.List;


public class DanhSachThu<Animal> {
    private List<Animal> danhSach = new ArrayList<>();

    public void them(Animal animal){
        danhSach.add(animal);
    }

    public Animal timKiemThu(String ten){
        Animal animal = null;

        For (Animal a : danhSach){
            if(a.getTen().equals(ten)){
                animal = a;
            }
        }
    }
    
}
