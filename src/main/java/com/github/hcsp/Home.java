package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {
        System.out.println(newCat("White"));
    }

    public static Cat newCat(String name) {
        // Create a new Cat instance, assign the name to its "name" member variable,
        // and return it here
        Cat Cat1=new Cat();
        Cat1.name=name;
        return  Cat1;
        // 在这里创建一个新的Cat实例，将其成员变量"name"设为参数所指定的名字，并返回之
    }
}
