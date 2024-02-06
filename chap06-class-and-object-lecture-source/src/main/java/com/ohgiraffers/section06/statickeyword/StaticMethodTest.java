package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {
    private int count;
    public void nonStaticMethod(){
        this.count++; //인스턴스 생성 후 사용이 가능한 메소드이기 때문에 this에 주소가 들어있다 (객체로 호출)
        System.out.println("nonStaticMethod 호출됨");
    }
    public static void StaticMethod(){
//        this.count++; // 객체를 생성하지 않고 사용해서 this에 주소가 들어갈 수 없다 (클래스로 호출해서)
        System.out.println("staticMethod 호출됨");
    }
}
