package com.ohgiraffers.section01.yssilsup;

public class Car2 {
    private boolean runing;

    public Car2(){
        System.out.println("car2 기본 생성자");
    }

    public void run(){
        runing = true;
        System.out.println("달린다");
    }

    public void bbang(){
        if (wrun()){
            System.out.println("경적");
        }else {
            System.out.println("달려야 경적을 울린다");
        }

    }
    public void stop(){
        runing = false;
        System.out.println("멈춘다");
    }

    protected boolean wrun(){
        return runing;
    }

}
