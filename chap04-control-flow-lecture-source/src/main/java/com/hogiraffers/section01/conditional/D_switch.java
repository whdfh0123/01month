package com.hogiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void simpleSwitchStatement(){
        /*
        switch 표현식
        switch(비교할변수){
        case 비교값1 : 비교할변수값 == 비교값1 이라면 실행할명령;
        break;
        case 비교값2 : 비교할변수값 == 비교값1 이라면 실행할명령;
        break;
        default ; 모두 해당하지 않을 경우 실행할 구문;
        break;
        } //값만 비교 가능 '실수'는 불가능

         */
        Scanner sc= new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int secondNum = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0; // 연산 결과를 저장할 변수

        switch(op){
            case '+' : result = firstNum+secondNum;
                break;

            case '-' : result = firstNum-secondNum;
                break;
            case '*' : result = firstNum*secondNum;
                break;
            case '/' : result = firstNum/secondNum;
                break;
            case '%' : result = firstNum%secondNum;
                break;
            default:
                System.out.println("잘못된 연산자를 입력하였습니다");
        }
        System.out.println(firstNum+""+op+""+secondNum+"="+result);

    }
    public void switchVendingMachine(){
        /*실습
        1. Scanner를 이용해 음료 이름과 갯수를 입력받는다
        2. switch-case 문을 사용해 ㅈㅓㄴ체 가격을 구한다
        3. 음료이름+을+0개 선택하셨습니다 가격을 투입해주세요
        위와 같이 출력
        코카콜라 1700원 환타 1200원 하늘보리 1000원 핫식스 2춴원
         */
        System.out.println("==========Ohgiraffers Vending Machine==========");
        System.out.println("코카콜라 환타 하늘보리 핫식스");
        System.out.println("++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        int result22 = 0;
        System.out.print("음료를 골라주세요 : ");
        String drink= sc.nextLine();
        System.out.print("음료의 갯수를 눌러주세요 : ");
        int i2 = sc.nextInt();
        switch (drink){
            case "코카콜라" : result22 += 1700*i2;
            break;
            case "환타" : result22+=1200*i2;
            break;
            case "하늘보리" : result22+=1000*i2;
            break;
            case "핫식스" : result22+=2000*i2;
            break;
            default:
                System.out.println("음료의 이름과 갯수를 다시 확인해주세요");return;
        }
        System.out.println(drink+"을(를) "+i2+"개 선택하셨습니다 "+result22+"원을 투입해주세요");
    }
}
