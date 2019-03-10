package com.andy.domain;

public interface AirConditioning {
    void turnOn();
    void turnOff();
    void changeMode(String mode);
    void changeDegree(int degree);
}
