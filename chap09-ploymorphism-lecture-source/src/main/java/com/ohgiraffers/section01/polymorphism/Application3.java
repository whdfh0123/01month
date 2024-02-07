package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3 = new Application3();
        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        app3.feed(animal1);  // 동일한 타입이기 때문에 가능함
        app3.feed(animal2);
        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();
        app3.feed(animal3); // 안에서 형변환이 일어남 명시적형변환은 해줄 수 있지만 자동이라 상관X
        app3.feed(animal4);

        app3.feed(new Cat());
        app3.feed(new Tiger());
    }
    public void feed(Animal animal){

        animal.eat();
    }
}
