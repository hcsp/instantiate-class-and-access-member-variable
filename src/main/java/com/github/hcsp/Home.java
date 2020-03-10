package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {
        System.out.println(newCat("White"));
    }
    public static Cat newCat(String name) {
        Cat cat=new Cat();
        cat.name=name;
        return cat;
    }



}
