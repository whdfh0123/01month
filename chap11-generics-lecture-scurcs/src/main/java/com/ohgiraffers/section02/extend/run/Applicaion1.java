package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Applicaion1 {
    public static void main(String[] args) {
        //토끼이거나 토끼의 후손 타입만 가능
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>(); 에러에러에러

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        farm4.setAnimal(new Snake()); //setter도 토끼만 가능
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
        ((Bunny)farm6.getAnimal()).cry();// << 형변환 생략 제네릭을 사용해서 올바른 타입을 타입변수로 지정하는 경우
        //인스턴스 내부에 있는 타입 자체가 Rabbit타입을 가지고 있는 것이 보장되어 있기 때문에 형변환 생략 가능

    }
}
