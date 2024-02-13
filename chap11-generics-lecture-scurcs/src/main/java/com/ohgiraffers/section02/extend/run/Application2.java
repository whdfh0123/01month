package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {
//        [와일드카드]
        //제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을때
        //그 객체의 타입 변수를 제한할 수 있다

        // <?> : 제한 없음
        // <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용헤 생성한 인스턴스만 인자로 사용 가능)
        // <? super Type> : 와일드카드의 하한 제한 (T 타입 또는 T의 상위 타입을 허용하는 와일드 카드
        WildCardFarm wildCardFarm1 = new WildCardFarm();
//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));  // 토끼가 아니라서 불가능

        wildCardFarm1.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm1.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm1.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // <? extends Bunny>
//        wildCardFarm1.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));  래빗은 부모임 버니나 버니의 후손만 가능
        wildCardFarm1.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm1.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // <? super Bunny>
        wildCardFarm1.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm1.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm1.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));  자신이나 부모만 가능 후손은 XX
    }
}
