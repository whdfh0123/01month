package com.hogiraffers.section03.branchong;

public class A_break {
    /* break문은 반복문 내에서 사용한다
    반복믄ㅇ의 조건문 판단 결과와 상관없이 반복문을 빠져나올때
    사용한다
    일반적으로 of(조건식){break;} 차럼 사용된다
    단, switch문은 반복문이 아니지만 예외적으로 사용
     */
    public void simpleBreakSrarement(){
        int sum = 0;
        int i = 1;
        while(true){
            sum+=i;
            if (i==100){
                break; // i==100 이라면 빠져나오게
            }
            i++;
        }
        System.out.println("1부터 100까지의 합 : "+sum);
    }
    public void simpleBreakStatement2(){
        /*
        break는 모든 반복문을 종료하는 것이 아닌
        자긴에게 ㄱ가장 인접한 반복문만 종효한다
         */
        for (int dan = 2; dan <= 9; dan++){
            for (int su= 1; su<10; su++){
                if(su>5){
                    break;
                }
                System.out.println(dan+"X"+su+"="+(dan*su));
            }
            System.out.println();
        }
    }
    public void testJumpBreak(){
        label :
        for (;;){
            for(int i=0; i<10; i++){
                System.out.println(i);
                if(i == 3){
                    break  label;
                }
            }
        }
    }
}
