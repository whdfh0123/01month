package com.ohgiraffers.section01.generic;

public class silsupAplication {
    public static void main(String[] args) {
        GenericTest<Integer> gt1 = new GenericTest<>();  //전에 정해주지 않은 타입을 Integer(int)로 지정한다
        gt1.setValue(10);   // 세터로 값을 넣어준다
        System.out.println(gt1.getValue()); // 게터로 값 확인
        System.out.println(gt1.getValue()instanceof Integer);  //값이 int가 맞는지 확인한다


        // 다시 String 으로 복습해보기
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("복습한다");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue()instanceof String);
    }
}
