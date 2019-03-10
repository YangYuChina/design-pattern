package com.andy.domain;

public class ChangHongTelevision implements Television {
    @Override
    public void turnOn() {
        System.out.println("长虹电视开启");
    }

    @Override
    public void turnOff() {
        System.out.println("长虹电视关闭");
    }

    @Override
    public void changeChannel(int num) {

    }

    @Override
    public void changeVolume(int volume) {

    }
}
