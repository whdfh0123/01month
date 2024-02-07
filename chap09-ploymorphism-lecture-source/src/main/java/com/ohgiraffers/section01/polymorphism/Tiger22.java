package com.ohgiraffers.section01.polymorphism;

public class Tiger22 extends Animal22{

    @Override
    public void zzz(){
        System.out.println("호랑이가 잔다 얘도 코털은 건들지말자");
    }
    @Override
    public void pain(){
        System.out.println("호랑이가 아프다 가까이 가지 말자");
    }
    @Override
    public void smile(){
        System.out.println("호랑이 기분이 좋아보인다");
    }

    public void punch(){
        System.out.println("호랑이의 펀치");
    }
}
