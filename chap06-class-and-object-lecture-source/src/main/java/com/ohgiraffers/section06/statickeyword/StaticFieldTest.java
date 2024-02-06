package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){}  //기본생성자

    public int getNonStaticCount(){
        return this.nonStaticCount; //this 를 사용하지 않아도 괜찮지만 일단 객체를 가리키게 해본다
    }
    public int getStaticCount(){
        //static 필드에 접근하지 위해서는 클래스명.필드명으로 접근한다
        //this. 로도 접근은 가능하지만 사용하지 않는 것이 좋다
//        return this.staticCount;
        return StaticFieldTest.staticCount;  // static이라 클래스명붙이기
    }
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }
    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;  // static이니까 앞에 클래스명 써주기
    }
}
