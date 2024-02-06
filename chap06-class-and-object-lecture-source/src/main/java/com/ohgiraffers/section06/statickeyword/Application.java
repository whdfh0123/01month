package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /*
    static
    정적 메모리 영역에 프로그램이 start될떄 할당을 하는 키워드이다
    인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다
    여러 인스턴스가 공유해서 사용할 목적의 공간이다
    하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다
    명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제해야한다
    의도적으로 static키워드를 사용하는 대표적인 얘는 singleton 객체를 생성할 떄 이다
     */
        StaticFieldTest sft1 = new StaticFieldTest(); //객체 생성

        System.out.println(sft1.getNonStaticCount()); //초기값 확인
        System.out.println(sft1.getStaticCount());

        sft1.increaseNonStaticCount(); //하나씩 증가
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());  // 값 확인하기
        System.out.println(sft1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest(); // 새로운 객체
        System.out.println(sft2.getNonStaticCount()); //논스태틱은 객체에 값을 저장해서 새로운 객체는 초기화
        System.out.println(sft2.getStaticCount()); // 스태틱은 값을 클래스에 저장하므로 유지되어 하나가 증가된 '1' 출력

        //=================================

        // 스태틱 메소드 테스트
        StaticMethodTest smt = new StaticMethodTest(); //객체생성 후 논스태틱 호출하기
        smt.nonStaticMethod();

        StaticMethodTest.StaticMethod(); // 스태틱 메소드 호출
        smt.StaticMethod();  // 인스턴스를 호출하지 않고 사용하기 위한게 스태틱 메소드 객체호출 가능은 하지만 권장하지 않는다
    }

}
