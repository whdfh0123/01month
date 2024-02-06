package com.hogiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void simpleIfStatment() {
        /*if문 표현식
        if(조건식) {
            조건식이 true이면 실행할 명령문
        }

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("입력하신 숫자는 짝수입니다");
        }
        System.out.println("프로그램을 종료합니다");
    }
    public void nesredIfStatment(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("양수이면서 짝수구나");
            }
            if (num%2 != 0){
                System.out.println("didtndlaustj ghftn");
            }
        }
        System.out.println("끝");
    }
}
