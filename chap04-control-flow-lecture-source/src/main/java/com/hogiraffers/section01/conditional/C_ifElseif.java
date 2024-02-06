package com.hogiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void simpleIfElseIfStatment(){
        /*
        if - elseif문 표현식
        if(조건식1) {
        조건식1이 true라면 실행할 명령문;
        }else if(조건식2) {
        1false이고 조건식 2true라면 실행
        }else {
        조건식 1,2모두 false라면 실행할 명령문
        }
         */
        System.out.println("두둥 산신령 등장");
        System.out.print("도끼를 골라봐라 1.금도끼/2.은도끼/3.쇠도끼 (숫자로 입력하시오) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("거짓말 하지 말거라 떼잉쯧");
        }else if(answer==2){
            System.out.println("은도끼도 거짓말이구나");
        }else{
            System.out.println("솔직한 녀석이구나 쇠도끼를 빨리 가져가거라");
        }
        System.out.println("산신령이 없어졌다..");


    }
    public void nestedIfElseIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("점수를 입력하세요 : ");
        int point = sc.nextInt();

        //학생의 등급을 저장하기 위한 변수선언
        String grade = "";

        if(point>=90){
            grade = "A";
            if(point>=95){
                grade = grade+="+";
            }
        }else if(point>=80){
            grade = "B";
            if(point>=85){
                grade += "+";
            }
        }else if(point>=70){
            grade = "C";
            if(point>=75){
                grade += "+";
            }
        }else if(point>=60){
            grade = "D";
            if (point >= 65){
                grade += "+";
            }
        }else {
            grade = "F";
        }
        System.out.println(name+"학생의 점수는 "+point+"점 "+grade+"등급입니다");
    }
}
