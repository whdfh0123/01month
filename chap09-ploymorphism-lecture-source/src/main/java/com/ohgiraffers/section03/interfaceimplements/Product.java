package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct , java.io.Serializable{
    // 인터페이스 상속받음 , 인터페이스는 여러 개를 상속 받기가 가능
    // extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능해진다
    // 단 extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다 ( 순서 바뀌면 에러 발생 )
    // 인터페이스는 무조건 오버라이딩을 다 해줘야한다??


    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨");
    }

    @Override
    public void absrMethod() {
        System.out.println("InterProduct의 absrMethod 오버라이딩한 메소드 호출됨");
    }

    //static 메소드는 오버라이딩 할 수 없다
//    @Override
//    public static void staticMethod(){}

    // default 메소드는 인터페이스에서만 작성 가능하다
//    @Override
//    public default void deaultMethod(){}


    // default 키워드를 제외하면 오버라이딩이 가능하다
    // 디폴트는 재정의하지 않아도 에러가 나지 않는다고 함
    @Override
    public void defaultMethod() {
        System.out.println("Product클래스의  defaultMethod호출됨");
    }
}
