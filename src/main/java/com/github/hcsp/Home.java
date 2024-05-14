package com.github.hcsp;
import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat newCat(String name) {
        Cat newCat = new Cat();
        newCat.name = name;
        return newCat;
    }

    public static void main(String[] args) {
        System.out.println ( newCat("White") );
    }
}
