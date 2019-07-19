package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {
        // println(obj)调用String.valueOf(x)
        // String.valueOf(x)调用被override的toString方法
        // 打印出"Cat(" + name + ")"
        System.out.println(newCat("White"));
    }

    public static Cat newCat(String name) {
        // Create a new Cat instance, assign the name to its "name" member variable,
        // and return it here
        // 在这里创建一个新的Cat实例，将其成员变量"name"设为参数所指定的名字，并返回之
        Cat cat = new Cat();
        cat.name = name;
        return cat;
    }
}
