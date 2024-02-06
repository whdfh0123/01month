package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn; // 초기에는 시동이 꺼진 false 상태
    private int speeed;

    public void starUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다 출발 준비 완료");
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 앞으로 움직입니다");
            this.speeed += 10;
            System.out.println("현재 차의 시속은 + " + this.speeed + " km/h입니다");

        } else {
            System.out.println("시동부터 걸어");
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speeed > 0) {
                this.speeed = 0;
                System.out.println("브레이크를 밟았습니다 멈출게요 ");
            } else System.out.println("이미 멈춰있다");
        } else {
            System.out.println("시동부터 걸어줘요");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (0 < this.speeed) {
                System.out.println("달리는 차는 시동을 끌 수 없어 차를 멈춰");
            } else {
                this.isOn = false;
                System.out.println("시동 off");
            }
        } else {
            System.out.println("이미 꺼짐");
        }
    }
}