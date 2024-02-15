package com.ohgiraffers.section01.exception;

public class Application1 {

    // 2.호출하는 메인에 작성해주기
    public static void main(String[] args) throws Exception{
        /* 예외를 발생시키는 구문
        [ throw new 예외클래스명(); ]
        [ 예외 처리 방법 ]
        1. throws로 위임
        2. try-catch로 처리
         */
        ExceptionTest et = new ExceptionTest();
        // 1.메소드 사용 시에도 예외처리를 해줘야한다
        et.checkEnoughMoney(1000, 5000);  //이건 돈이 충분해서 평소와 비슷하다
        et.checkEnoughMoney(5000,1000);

    }



}
