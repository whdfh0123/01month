package com.hogiraffers.section02.looping;

import java.util.Scanner;

public class Silsup_0130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // 실습문제 1
//        System.out.print("술을 드시고 싶으면 나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        if(age>=20){
//            System.out.println("판매 가능합니다");
//        }else {
//            System.out.println("판매 불가입니다");
//        }
//        // 실습문제 2
//        System.out.print("당첨 번호가 어떻게 되세요?? (1~10사이의 숫자를 입력해주세요)");
//        int num1 = sc.nextInt();
//
//        if(1<=num1 && num1<=10){
//            if(num1%2!=0){
//                System.out.println("홀수네요 인형 선물입니다!");
//            }else{
//                System.out.println("짝수네요 모자 선물입니다!");
//            }
//        }else{
//            System.out.println("당첨번호는 1~10사이에만 있어요");
//        }

        // 실습문제 3
//        System.out.print("성실 점수를 입력해주세요 : ");
//        int score1 = sc.nextInt();
//        System.out.print("서비스 점수를 입력해주세요 : ");
//        int score2 = sc.nextInt();
//        System.out.print("미소 점수를 입력해주세요 : ");
//        int score3 = sc.nextInt();
//        if((score1+score2+score3)/3>=60 && score1>=40 && score2>=40 && score3>=40) {
//            System.out.println("합격입니다!");
//        }else if((score1+score2+score3)/3<60 && score1>=40 && score2>=40 && score3>=40){
//            System.out.println("평균점수 미달로 불합격 입니다");
//        }else {
//            if (score1<40){
//                System.out.println("성실 점수 미달로 불합격");
//            }
//            if(score2<40){
//                System.out.println("서비스 점수 미달로 불합격");
//            }
//            if (score3<40){
//                System.out.println("미소 점수 미달로 불합격");
//            }
//        }


        // 실습문제 4
//        System.out.println("월 급여 입력 : ");
//        int lupang = sc.nextInt();
//        System.out.println("매출액 입력 : ");
//        int sales = sc.nextInt();
//        int bonus = 0;
//        int total = 0;
//
//        if(sales<10000000){
//            bonus = 0;
//            total = lupang + (sales*bonus);
//        }else if(sales>=10000000){
//            bonus = 1;
//            total = lupang + ((sales*bonus)/100);
//        }else if(sales>=30000000){
//            bonus = 3;
//            total = lupang + ((sales*bonus)/100);
//        }else if(sales>=50000000){
//            bonus = 5;
//            total = lupang + ((sales*bonus)/100);
//        }else{
//            System.out.println("입력된 값을 확인해 주세요");
//        }
//        System.out.println("==========");
//        System.out.println("매출액 : "+sales);
//        System.out.println("보너스율 : "+bonus+"%");
//        System.out.println("월 급여 : "+lupang);
//        System.out.println("보너스 금액 : "+(sales*bonus)/100);
//        System.out.println("==========");
//        System.out.println("총 급여 : "+total);


        // for 실습문제 1
//        System.out.println("1 이상의 정수를 입력하세요 : ");
//        int num1 = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i<=num1; i++){
//            if(i%2==0){
//                sum +=i;
//            }
//        }
//        System.out.println("1부터 10까지 짝수의 합 : "+sum);


        // for 실습문제 2
//        System.out.print("정수를 입력하세요 : ");
//        int num1 = sc.nextInt();
//        for (int i = 1; i <=num1; i++){
//            if(i%2==0){
//                System.out.print("마");
//            }else {
//                System.out.print("토");
//            }
//        }
    }
}
