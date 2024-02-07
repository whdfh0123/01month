package com.ohgiraffers.section01.yssilsup;

public class Appilcation {
    public static void main(String[] args) {

        // Car2 객체 생성하고 메소드를 호출해본다
        Car2 car21 = new Car2();

        car21.bbang();
        car21.run();
        car21.bbang();
        car21.stop();


        // Car2를 상속받은 LrCar 객체 생성 후 호출
        LrCar lrCar1 = new LrCar();
        lrCar1.bbang();
        lrCar1.run();
        lrCar1.bbang();
        lrCar1.stop();

        //Car2를 상속받은 PlCar 객체 생성 후 호출
        PlCar plCar = new PlCar();
        plCar.bbang();
        plCar.run();
        plCar.bbang();
        plCar.stop();

    }

}
