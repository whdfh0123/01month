package com.ohgiraffers.section01.polymorphism;

public class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("고양이가 생선을 먹고 있습니다");
    }

    @Override
    public void run(){
        System.out.println("고양이가 달려갑니다");
    }

    @Override
    public  void cry(){
        System.out.println("고양이가 울음소리를 냅니다 야옹");
    }

    // 고양이의 능력 새로 추가해주기
    public void jump(){
        System.out.println("고양이의 점프");
    }
}
