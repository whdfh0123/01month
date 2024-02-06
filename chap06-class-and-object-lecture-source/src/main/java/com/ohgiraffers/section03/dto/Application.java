package com.ohgiraffers.section03.dto;


public class Application {
    public static void main(String[] args) {
        /*
        [ DTO ]
        캡슐화 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진 클래스와 객체를 추상화하는 기법
        행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체( Data Transfer Object ) 의 경우이다
        캡슐화의 원칙을 준수하여 모든 필드를 private로 설정해 직접 접근을 막고
        각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성한다
        private 필드와 필드값을 수정하는 설정자 (setter) 필드에 접근하는 접근자 들로 구성된다
        주로 계층간 데이터를 주고 받을 목적으로 사용한다
         */
        MemberDTO member = new MemberDTO();

        member.setNumber(10);
        member.setName("hong");
        member.setAge(11);
        member.setGender('남');
        member.setHeight(190.0);
        member.setWeight(80.6);
        member.setActtivsted(true);

        System.out.println(member.getNumber());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getHeight());
        System.out.println(member.getWeight());
        System.out.println(member.isActtivsted());
    }
}
