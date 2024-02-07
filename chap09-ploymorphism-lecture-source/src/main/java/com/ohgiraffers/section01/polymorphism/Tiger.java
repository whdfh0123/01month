package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat(){
        System.out.println("호랑이가 고기를 뜯어 먹는다");
    }

    @Override
    public void run(){
        System.out.println("호랑이 어슬렁 어슬렁 걸어가기");
    }
    @Override
    public void cry(){
        System.out.println("호랑이 어흥");
    }

    //호랑이의 새로운 능력 추가
    public void bite(){
        System.out.println("호랑이의 물어뜯기!");
    }
}
