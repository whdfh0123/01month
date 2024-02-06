package com.ohgiraffers.section02.encapsulation.solution1;

public class Minster {

//    String name;
//    int hp;

//    public void setInfo(String info){
//        this.name = info;
//    }
//    public void setHp(int hp){
//        if (0 < hp){
//            this.hp = hp;
//        }else {
//            this.hp = 0;
//        }
//    }
//    public String getInfo(){
//        return "몬스터의 이름은 "+this.name+ "이고 체력은 " + this.hp+"입니다";
//    }

    //이렇게 메소드로 호출하면 메소드만 약간 수정하면 된다
    //직접 호출했으면 다 하나하나 수정해야함
    String kinds;
    int hp;
    public void setInfo(String info){
        this.kinds = info;
    }
    public void setHp(int hp){
        if (0 < hp){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }
    public String getInfo(){
        return "몬스터의 이름은 "+this.kinds+ "이고 체력은 " + this.hp+"입니다";
    }
}
