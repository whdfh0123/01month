package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

//    @Override   // 상속해준 곳과 메소드 이름이 다르면 에러
//    public void method2(int num){}  //상속받으면 메소드 이름을 같게 해야함

    // 메소드 리턴 타입 변경 에러
//    @Override
//    public int method

    //매개변수갯수, 타입 변경 에러
//    @Override   // @overide를 쓰지 않으면 그냥 새로운 메소드를 생성한다고 생각해서 에러가 나지 않지만 원하는 결과가 나오지 않을 수 ㅣㅇㅆ다
//    public void method(String num){}
    @Override
    public void method(int num){} // 모두 일치해야 오류 없음

    // private 메소드는 오버라이딩 불가
//    @Override
//    private void privateMethod(){}

    // final 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod(){}

    //부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능

//    @Override         // default(안써주는것) protected보다 좁은 접근제한자로 불가능
//    void protectedMethod(){}

//    @Override
//    protected void protectedMrthod(){}  //  같은 범위는 가능

    @Override
    public void protectedMethod(){}  // 더 넓은 범위 가능




}
