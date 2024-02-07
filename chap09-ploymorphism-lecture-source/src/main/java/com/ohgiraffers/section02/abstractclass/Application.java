package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* [추상클래스와 추상메소드]
        추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다
        추상클래스는 클래스 선언서부 abstact키워드를 명시해야 한다
        추상클래스로는 인스텐스를 생성할 수 없다
        추상클래스를 사용하려면 추상클래스를 상속받은 하위 클랴스를 이용햐서
        인스턴스를 생성해야한다
        이때 추상클래스는 이와 상위 타입으로 사용될 수 있으며 다향성을 이용할 수 있다

        주상 클래스를 상속받아 구현할 때는 extends키워드를 사용하며
        자바에서는 extends로 클래스를  상속받을 시 하나의 부모 클래스만 가질ㄹ수 있다
        (단일상속)

        [추상메소드]
        메소드의 선언부만 있고 구현부가 없는 메소들를 추상 메소드라고 한다
        추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 한다
         예시 > public abstract void method();
         */
//        Preduct preduct = new Preduct(); 추상클래스로는 인스턴스 생성 불가능
        // 상속받은 쪽에서 생성
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Preduct);

        // 다형성 적용 > 추상클래스를 래퍼런스 타입으로 활
        Preduct preduct = new SmartPhone();

        //동적 바인딩에 의해 SmartPhone의 메소드가 호출된다
        preduct.abstMethod();

        preduct.setNonStaticMethod();

        // static 메소드는 그냥 사용 가능 (인스턴스 생성 불필요)
        Preduct.staticmethod();
    }
}
