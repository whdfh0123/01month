package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeEception;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNagativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
        et.checkEnoughMoney(20000,100000);

        }catch(NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        }catch (PriceNagativeException e){
            System.out.println("PriceNagativeException 발생");
            System.out.println(e.getMessage());
        }catch (MoneyNegativeEception e){
            System.out.println("MoneyNegativeEception발생");
            System.out.println(e.getMessage());
        }finally {
            // 예외 발생 여부와 상관없이 실행
            System.out.println("finally 블럭 내용 등장");

        }
        System.out.println("프로그램 종료");


    }
}
