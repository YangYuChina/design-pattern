package com.andy.domain;

public class TclTelevision implements Television {
    @Override
    public void turnOn() {
        System.out.println("TCL王牌电视开启");
    }

    @Override
    public void turnOff() {
        System.out.println("TCL王牌电视关闭");
    }

    @Override
    public void changeChannel(int num) {

    }

    @Override
    public void changeVolume(int volume) {

    }
}
