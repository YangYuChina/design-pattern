package com.andy.domain;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("小猫睡觉");
    }
}
