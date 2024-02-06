package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class silsup0201 {
    public static void main(String[] args) {
        String str1[] = new String[]{"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String str2[] = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
        System.out.print("내가 뽑은 카드는 : ");
        for (int n = 1; n <= 5; n++) {
            int i = (int) (Math.random() * str1.length);
            int j = (int) (Math.random() * str2.length);
            System.out.print(str1[i]+" "+str2[j]);
            if(n<5){
                System.out.print(", ");
            }


        }
    }
}







