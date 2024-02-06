package com.hogiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void siimpleIfElse() {

    /*if-else
    if(조건식) {
    조건식이 트루ㅇ면 실행할 멸령
    } else {
    조건식이 false에 싱행
    }

     */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("입력한 숫자는 짝수");
        } else {
            System.out.println("입력한 숫자는 홀수");

        }

    }
    public void nestedIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();

        if(num != 0){
            if(num>0){
                System.out.println("양수입니다");
            }else {
                System.out.println("음수입니다");
            }
        }else {
            System.out.println("0입니다");
        }
        System.out.println("프로그램 종료");
    }
}
