package com.andy.domain;

public class TclAirConditioning implements AirConditioning {
    @Override
    public void turnOn() {
        System.out.println("TCL王牌空调开启");
    }

    @Override
    public void turnOff() {
        System.out.println("TCL王牌空调关闭");
    }

    @Override
    public void changeMode(String mode) {

    }

    @Override
    public void changeDegree(int degree) {

    }
}
