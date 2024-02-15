package com.ohgiraffers.section03.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuoerClass{
    // 예외 없이 오버라이딩 할 수 있다
//    @Override
//    public void method(){}  //정상

    //같은 예외를 던져주는 구문으로 오버라이딩 가능
//    @Override
//    public void method()throws IOException{}  //정상

    //부모의 예외처리 클래스보다 상위의 예외로는 후손의 클래스를 오버라이딩 불가
//    @Override
//    public void method()throws Exception{}

    //부모의 예외처리 클래스보다  하위의 예외(즉 더 구체적인 예뢰의 경우 오버라이딩 힐 수 있다
    @Override
    public void method() throws FileNotFoundException{}
}
