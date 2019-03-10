package com.andy.domain;

public class ChangHongAirConditioning implements AirConditioning {
    @Override
    public void turnOn() {
        System.out.println("长虹空调开启");
    }

    @Override
    public void turnOff() {
        System.out.println("长虹空调关闭");
    }

    @Override
    public void changeMode(String mode) {

    }

    @Override
    public void changeDegree(int degree) {

    }
}
