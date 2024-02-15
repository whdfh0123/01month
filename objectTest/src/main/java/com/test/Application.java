package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /* 1. 사람 생성(이름, 나이는 생성과 동시에 초기화)
    * 2.  1에서 만든 사람의 국적 설정(한국, 일본, 중국, 홍콩, 터키중 하나만 가능/ 다른 국가를 입력 시 한국으로 자동설정)
    * 3. 강아지 입양 -> 사람이 할 수 있는 일(=Person의 메소드를 호출해서 Dog를 추가)
    * 단 강아지는 반드시 이름이 있어야 함(강아지 입력 스캐너로 입력 받기)
    * 4, 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
    * (=Person의 매개변수가 있는 메소드를 호출해서 dog에 skill 추가*/
    String[] teachAbility = new String[]{"앉아","빵","기다려"};
    Person person1 = new Person("hong",20);
    person1.setCon("한국");
    person1.adoptDog();
    person1.teachDog(teachAbility);
    person1.info();
    }

}
