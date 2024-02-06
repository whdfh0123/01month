package com.hogiraffers.section01.conditional.silsup;

import java.util.Scanner;

public class silsupmed {

//    public void name(){
//
//    }
//    public String void med{
//        System.out.println("상어 뚜 루루 뚜루");
//        System.out.println("뚜 루루 뚜루");
//        System.out.println("바닷속 뚜 루루 뚜루");
//        System.out.println(" 상어!");
//    }
    public void ran(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요 : ");
        int i = sc.nextInt();
        int j = (int)(Math.random()*10);
        System.out.println("입력받은 정수와 랜덤의 곱은 : "+i*j);
    }
}
