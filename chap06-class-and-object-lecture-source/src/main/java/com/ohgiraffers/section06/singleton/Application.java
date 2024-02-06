package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {
         /*singleton pattern 이란
    애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
    하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게 함(매번 인스턴스를 생성하지 않음)
    장점
    1. 첫번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
    두번째 이용시에는 인스턴스 생성 시간 없이 사용가능
    2. 인스턴스가 절대적으로 한개만 존재하는 것을 보증할 수 있다
    단점
    1. 싱슬톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다
    (유지보수와 테스트애 문제점이있음)
    2. 동시성 문제를 고려해서 설계해야 하기 떄문에 난이도 높음

    싱글톤 구현 방법
    1. 이른 초기화 ( Eager Initialixation )
    2. 게으른 초기화 (Lazy Initialixation )
     */
        //이른 초기화 구현
        //생성자를 이용하여 인스턴스 생성을 하지 못하고  getInstance() 메소드를 호출해야만 인스턴스를 생성할 숭 있다
//    EagerSingleton eger =new EagerSingleton(); // 생성자가 private라서 접근불가
        EagerSingleton eager1 = EagerSingleton.getInstance();  // static 호출이라 클래스명으로 호출
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("eager1 의 해시코드 : "+eager1.hashCode());
        System.out.println("eager2 의 해시코드 : "+eager2.hashCode());

        LazySingleton lazy1 = LazySingleton.getInstance();  // static 호출이라 클래스명으로 호출
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("lazy1의 해시코드 : "+lazy1.hashCode());
        System.out.println("lazy2의 해시코드 : "+lazy2.hashCode());
    }
}
