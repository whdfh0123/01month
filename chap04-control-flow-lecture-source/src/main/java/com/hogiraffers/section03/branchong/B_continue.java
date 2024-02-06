package com.hogiraffers.section03.branchong;

public class B_continue {
    public void simpleContinuement(){
        /*continue문은 반복문 내에서 사용한다
        해당 반복문의 반복 회차를 멈추고 다시 증감식으로 넘어가게 해준다
        일반적으로 if(조건식) {comtinue;}처럼 사용된다
        보통 특정 조건에 대한 예외를 처리하고자 할 때 사용
         */
        for (int i = 1; i <=100; i++){
            if(i%4==0 && i%5==0){
                System.out.println(i);
            }else {
                continue;
            }
        }
    }
    public void simpleContinueStatement2(){
        //구구단 홀수 곱하기 만 출력
        for (int dan = 2; dan <= 9; dan++){
            for (int su = 1; su <= 9; su++){

                if(su%2==0){
                    continue;
                }
                System.out.println(dan+"X"+su+"="+dan*su);
            }
        }

    }
    public void testJumpContinue(){
        for (int dan = 2; dan < 10; dan++){
            System.out.println("======="+dan+"단=======");

            label1:
            for (int su = 1; su <10; su++){
                if(su%2==0) {
                    continue label1;
                }
                System.out.println(dan+"+"+su+"="+(dan*su));
            }
        System.out.println();
        }
    }
}
