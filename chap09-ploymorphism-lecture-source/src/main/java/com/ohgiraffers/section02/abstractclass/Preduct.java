package com.ohgiraffers.section02.abstractclass;

public abstract class Preduct {  // abstract 넣어주기
    // 추상클래스 만들기
    private int nonStaticFueld;
    private static int staticFiedl;

    public Preduct(){}

    public void setNonStaticMethod(){
        System.out.println("product클레스의 논스태틱호출");
    }
    public static void staticmethod(){
        System.out.println("preduct클래스의 스태틱메소드 호출함");
    }
    public abstract void abstMethod();  //추상메소드
}
