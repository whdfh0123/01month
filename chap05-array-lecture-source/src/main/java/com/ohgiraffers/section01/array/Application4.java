package com.ohgiraffers.section01.array;

public class Application4 {
    public static void main(String[] args) {
        /*카드뽑기
        1. 문자열 배열에 Spade Clover Heart Diamond를 저장
        2. 문자열 배열에 2,3,4,5,6,7,8,9,10,jack,Queen,King,Ace를 저장
        3. 난수 1번 2번 길이에 맞도록 각각 난수 발생
        4. 위에서 발생시킨 난수를 활용하여 카드 출력
        ===출력예시 --
        당신이 뽑은 카드는 Diamond 9 카드 입니다

         */
        String str1[] = new String[]{"SPADE","CLOVER","HEART","DIAMOND"};
        String str2[] = new String[]{"2","3","4","5","6","7","8","9","10","JACK","QUEEN", "KING", "ACE"};
        int i = (int)(Math.random()*str1.length);
        int j = (int)(Math.random()*str2.length);
        System.out.println("당신이 뽑은 카드는 "+str1[i]+" "+str2[j]+ "입니다.");

    }
}
