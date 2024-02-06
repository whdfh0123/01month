package com.ohgiraffers.section03.abstraction;

public class CarDriver {

    private final Car car = new Car();

    public void startUp(){
        car.starUp();
    }

    public void stepAccelater(){
        car.go();
    }
    public void stopBreal(){
        car.stop();
    }
    public void sss(){
        car.turnOff();
    }

}
