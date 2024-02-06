package com.ohgiraffers.section02.encapsulation.solution2;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        // 프라이빗이라 바로 접근불가
//        monster1.kinds = "프랑켄";
//        monster1.hp = 200;              에러발생
        //이렇게 막아서 간접 접근으로 하는 것이 캡슐화
        monster1.setKinds("프랑켄 슈타인");
        monster1.setHp(200);
        System.out.println(monster1.getInfo());


    }
}
