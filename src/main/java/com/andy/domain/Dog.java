package com.andy.domain;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("小狗吃肉骨头");
    }

    @Override
    public void sleep() {
        System.out.println("小狗睡觉");
    }
}
