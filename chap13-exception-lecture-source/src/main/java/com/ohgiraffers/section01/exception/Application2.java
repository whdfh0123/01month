package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /* try-catch 블럭을 이용한 예외처리 방법
         */
        ExceptionTest et = new ExceptionTest();

        // 2. 그런 메소드를 try 블럭 안에서 호출한다 (이렇게 하면 main 옆에 안 써줘도 괜찮은듯)
        try {
            et.checkEnoughMoney(1000,500); //1. 예외발생 가능성이 있는 메소드
            System.out.println("상품 구입 가능===================");
        }catch (Exception e){
            System.out.println("상품 구입 불가============="); // 즐거운 쇼칭 하세요는 그대로 출력하지 않고
            // 여기의 출력문만 출력 실행
        }
        System.out.println("프로그램을 종료합니다");

    }
}
