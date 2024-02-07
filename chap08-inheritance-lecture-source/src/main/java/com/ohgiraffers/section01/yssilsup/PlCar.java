package com.ohgiraffers.section01.yssilsup;

public class PlCar extends Car2{
    public PlCar(){
        System.out.println("PlCar 기본 생성자 호출");
    }

    public void run(){
        System.out.println("경찰차는 사이렌을 울리면서 달린다");
    }
    public void bbang(){
        System.out.println("시끄러운 경적 울리기");
    }
}
