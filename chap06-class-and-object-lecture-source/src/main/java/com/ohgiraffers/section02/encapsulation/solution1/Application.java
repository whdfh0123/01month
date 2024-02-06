package com.ohgiraffers.section02.encapsulation.solution1;

public class Application {
    public static void main(String[]args){
        Minster monster1 = new Minster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Minster monster2 = new Minster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(200);

        Minster monster3 = new Minster();
        monster3.setInfo("늑대인간");
        monster3.setHp(1);

        Minster monster4 = new Minster();
        monster4.setInfo("골렘");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());
    }

}
