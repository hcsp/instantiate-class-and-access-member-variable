package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static void main(String[] args) {       // 程序人口
        System.out.println(newCat("White"));   // 调用newCat方法并传入name参数
    }

    public static Cat newCat(String name) {   // newCat方法声明
        // Create a new Cat instance, assign the name to its "name" member variable,
        // and return it here
        // 在这里创建一个新的Cat实例，将其成员变量"name"设为参数所指定的名字，并返回

        Cat cat = new Cat(); // 创建一个cat对象
        cat.name = name;   // 为变量所指向的堆中的对象的name属性赋值
        return cat; //返回变量指向的对象

    }
}
