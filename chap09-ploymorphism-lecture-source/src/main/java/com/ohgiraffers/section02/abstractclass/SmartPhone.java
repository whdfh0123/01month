package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Preduct {

    /* extends 키워드로 클래스를 상속받을 때 두개 이상의 클래스는 상속하지 못한다
    추상클래스가 가지는 추상 메소드를  >>>>***반드시 오버라이딩 해야한다(강제성부여)***<<<<
     */
    public SmartPhone(){}

    @Override
    public void abstMethod(){
        System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출됨 ");

    }

    // 추가적으로 메소드 작성 가능
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함");
    }
}
