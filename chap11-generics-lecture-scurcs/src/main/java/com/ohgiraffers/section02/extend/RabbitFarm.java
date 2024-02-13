package com.ohgiraffers.section02.extend;
//public class RabbitFarm<T implements Animal> 에러남
//public class RabbitFarm<T extends Animal> 정상
// 인터페이스 상속 시 extends 키워드 사용
public class RabbitFarm <T extends Rabbit>{  // 이렇게 앞에 클래스를 붙이고 & 뒤에 인터페이스 가능
    //타입 변수가 토끼거나 후손만 가능
    // &로 여러 타입을 동시에 가지는 타입 변수를 지정할 수 있다 ('&' 로묶어준 모든 타입에 해당해야함)
    // 단 클래스는 하나만 지정할 수 있으며 &맨 앞에는 클래스, 이후로는 인터페이스가 와야한다
//    public class RabbitFarm <T extends Rabbit & Animal>{  // 이렇게 앞에 클래스를 붙이고 & 뒤에 인터페이스 가능

    private T animal;
    public RabbitFarm(){}
    public RabbitFarm(T animal){
        this.animal = animal;

    }
    public void setAnimal(T animal){
        this.animal = animal;
    }
    public T getAnimal(){
        return this.animal;
    }
}
