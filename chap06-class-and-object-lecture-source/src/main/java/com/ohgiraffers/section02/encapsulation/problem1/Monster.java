package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
//    String name; //이대로면 체력바가 음수도 가능 방지하기
//    int hp;

    String name; //전역변수이다 ==필드 == 속성 == 인스턴스변수
    int hp; //전역변수이다 ==필드 == 속성 == 인스턴스변수

    public void setHp(int hp){ // int hp == 매개변수 == 지역변수
        if(hp > 0){
            //this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는
            //래퍼런스 변수
            //지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
            //전역변수에 접근하기 위해서 this를 명시해야 한다
            this.hp = hp;
        }else {
            System.out.println("음수가 입력되어 몬스터 체력을 0으로 변경합니다");
            this.hp = 0;
        }
    }

}
