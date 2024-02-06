package com.ohgiraffers.section02.encapsulation.problem1;

import com.ohgiraffers.section01.user_type.Member;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.name = "슬라임";
        monster1.hp = 200;

        System.out.println("monster1.name : "+monster1.name);
        System.out.println("monster1.hp : "+monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "주황버섯";
        monster2.hp = -200; // 검증되지 않은 음수 체력바 몬스터 클래스에서 방지하기
        //이렇게 그냥 바로 접근하면 옳은 값이 들어갔는지 확인이 불가능하다

        System.out.println("monster2 name : "+monster2.name);
        System.out.println("monster2 hp : "+monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "골렘";
        monster3.setHp(-20);
        System.out.println("monster 3 name : "+monster3.name);
        System.out.println("monster 3 hp : "+monster3.hp);

    }
}
