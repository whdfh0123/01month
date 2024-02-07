package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /*
        [ 다형성 ]
        다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다
        그러므로 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
        하나의 메소드를 호출하여 객체별로 각기 다른 방법으로 동작하게 할 수도 있다

        [ 다형성의 장점 ]
        1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다
        2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다
            이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다
        3. 확장성이 좋은 코드를 작성할 수 있다
        4. 결합도를 낮춰서 유지보수성을 증가시킬수 있다
         */

        System.out.println("Animal 생성============");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Car생성 ==========");
        Cat cat = new Cat();
        cat.eat();
        cat.run();
        cat.cry();
        cat.jump();

        System.out.println("tiger 생성");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();


        /* Cat과 Tiger는 Anima 클래스를 싱속받았다
        따라서 Cat은 Cat타입이기도 하면서 Animal타입이기도 화며
        Tiger tiger 타입이기도 하면서 Animal타입 이기도하다


         */
        // 다형성 >> 부모 타입으로 자식 인스턴스 주소값 저장
        Animal a1 = new Cat();  // 클래스도 하나의 자료형(타입)이라고 생각해보기
        Animal a2 = new Tiger();

        //반대로 자식 타입으로 부모 인스턴스 주소값을 저장하려고 허면 에러 발생
//        Cat c = new Animal();    에러남
//        Tiger t = new Animal();

        /* [동적바인딩]
        컴파일 당시에는 (선언한) 해당 타입의 메소드와 연결되어 있다가
        런타임 당시 실제 객체가 가진 오버라이딘된 메소드로 바인딩이 바뀌어 동작하는것
         */
        System.out.println("동적바인딩 확인=========");
        a1.cry(); //
        a2.cry();

        // 현재 레퍼런스변수의 타입은 Animal이기 때문에
        // CAt과 Tiger 가 가지고 있는 고유 기능은 동작불가
//        a1.jump();
//        a2.bite

        //타입 형변환
        // class type casting : 클래스 형변환
        // 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다

        System.out.println("클래스타입 형변환 확인========");
        ((Cat)a1).jump();
        ((Tiger)a2).bite();


//        ((Tiger)a1).bite();  ClassCastException로 오류 발생 고유한 메소드를 실행시키려면 그 클래스의 이름에 맞게 형변환을 하자
        // 래퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지
        //비교하는 연산자 instanceof
        System.out.println("instanceof 확인 --------------");
        System.out.println("a1이 Tiger 타입인지 확인 : "+(a1 instanceof Tiger));  // boolean값으로 알려줌
        System.out.println("a1이 Cat 타입인지 확인 : "+(a1 instanceof Cat));
        // 상속 받은 타입도 합께 가지고 있다 (다형성)
        System.out.println("a1이 Animal 타입인지 확인 : "+(a1 instanceof Animal));
        // 모든 클래스는 Object의 후손이다
        System.out.println("a1이 Object 타입인지 확인 : "+(a1 instanceof Object));

        if (a1 instanceof Cat){
            ((Cat)a1).jump();
        }
        if(a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }else {
            System.out.println("타입이 다릅니다");
        }
        //클래스의 업캐스팅과 다운캐스팅 확인
        //up-castung : 상위 타입으로 형변환
        // down-casting : 하위 타입으로 형변환
        // up - casting 묵시적 형변환
        Animal animal1 = (Animal) new Cat();  // 애니멀이 상위타입 , 캣 하위타입 애니멀 강제형변환이 붙어있다생각하기
        Animal animal2 = new Cat();
        // 상위 타입으로는 자동 형변환이 여기서도 적용된다


        // 다운캐스팅
        Cat cat1 = (Cat) animal1; // down-casting 명시적형변환

//        Cat cat2 = animal2   묵시적 형변환 안됨

    }

}
