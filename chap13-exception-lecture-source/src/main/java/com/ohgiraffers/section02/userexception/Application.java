package com.ohgiraffers.section02.userexception;

public class Application {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(5000,1000);  // 돈 부족 예외 발생
//            et.checkEnoughMoney(-5000,1000);
//            et.checkEnoughMoney(5000,-1000);
            et.checkEnoughMoney(5000,10000);
        }catch (Exception e){
            e.printStackTrace(); // 자바에서 예외가 발생하면 추적해서 콘솔에 출력하는 메소드
        }

    }
}
