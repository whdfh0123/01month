package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class samsilsup1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bonus = 0;
        int chongWg = 0;
        System.out.print("월 급여 입력하세요 : ");
        int wg = sc.nextInt();
        System.out.print("매출액 입력하세요 : ");
        int mc = sc.nextInt();
        if(mc>=50000000){
            bonus = 5;
        }else if(mc>=30000000){
            bonus = 3;
        }else if(mc>=10000000){
            bonus = 1;
        }
        chongWg = wg+((mc*bonus)/100);
        System.out.println("===============");
        System.out.println("매출액 : "+mc);
        System.out.println("보너스율 : "+bonus+"%");
        System.out.println("월 급여 : "+wg);
        System.out.println("보너스 금액 : "+(mc*bonus)/100);
        System.out.println("===============");
        System.out.println("총 급여 : "+chongWg);

    }
}
