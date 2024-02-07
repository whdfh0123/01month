package com.ohgiraffers.section01.yssilsup;

public class LrCar extends Car2{
    public LrCar(){
        System.out.println("LrCar 기본 생성자");
    }
    public void run(){
        System.out.println("고급차는 조용하게 달린다");
    }
    public void stop(){
        System.out.println("부드럽게 멈춘다");
    }
}
