package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car(){
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }
    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다");
    }
    public void soundHorn(){
         if(isRunning()){
             System.out.println("빵!빵!");
         }else {
             System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 앖습니다");
         }
    }

    protected boolean isRunning(){  //private로 하면 자식이 접근불가
        // 자동차의 주행중 상태를 반환하는 기능 수행
        return runningStatus;
    }
    public void stop(){
        runningStatus = false;
        System.out.println("지동차가 멈춥니다.");
    }
}
