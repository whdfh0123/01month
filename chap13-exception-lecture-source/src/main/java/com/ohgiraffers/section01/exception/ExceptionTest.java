package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    // 메소드 헤드에서 작성해서 위임
    public void checkEnoughMoney(int price, int money)throws Exception{
        System.out.println("가지고 계신 돈은 "+money+"원입니다");
        if(money>=price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다");

        }else {
            throw new Exception(); //이렇게 이게 실행하면 밑에 구문은 실행하지 않음  (에러나고 끝났다)
        }
        System.out.println("즐거운 쇼핑 하세요");
    }
}
