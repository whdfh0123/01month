package com.test;

import java.util.Arrays;

public class Dog {
    /* 강아지 속성 : 이름(String), 재주(String[])*/
    private String name;
    private String[] skill;
    public Dog(){

    }
    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void learnSkill(String[] skill){
         this.skill = skill;
//        System.out.println(toString());  // 재주를 받고 출력해주는데 다른곳에서 출력하도록 해보기

    }
    public void dogInfo(){
        System.out.println("강아지의 이름은 : "+this.name);
        System.out.print("강아지의 재주는 : ");
        if(skill==null){
            return;
        }
        for (int i = 0; i<skill.length; i++){
            System.out.print(skill[i]);
            if(i<2){
                System.out.print(", ");
            }

        }
        System.out.println();
    }
    public void doSomeThingVoid1(String gogo) {
        switch (gogo) {
            case "앉아":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        System.out.println(this.name + "가 앉았다@@@@");
                    }
                }
                break;
            case "빵":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        System.out.println(this.name + "가 총 맞은 척을 한다");
                    }
                }
                break;
            case "기다려":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        System.out.println(this.name + "가 기다린다");
                    }
                }
                break;
            default:
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        System.out.println("어떤 재주라도 해본다");
                    }else if(skill[i].equals(gogo)==false && i==skill.length-1){
                        System.out.println(this.name + " : 뭔소리야");
                    }
                }
                break;
        }
    }
    public String doSomeThingVoid2(String gogo) {
        String doTry = "뭐하지";
        switch (gogo) {
            case "앉아":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        doTry = this.name + "가 앉았다@@@@";
                    }
                }
                break;
            case "빵":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        doTry = this.name + "가 총 맞은 척을 한다";
                    }
                }

                break;
            case "기다려":
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        doTry = this.name + "가 기다린다";
                    }
                }
                break;
            default:
                for (int i = 0; i < skill.length; i++) {
                    if (skill[i].equals(gogo)) {
                        doTry = "어떤 재주라도 해본다";
                    }else if(skill[i].equals(gogo)==false && i==skill.length-1){
                        doTry = this.name + " : 뭔소리야";
                    }
                }
                break;


        }
        return doTry;
    }
    public boolean doSomeThingVoid3(String gogo) {
        boolean bulga = true;

        for (int i = 0; i < skill.length; i++) {
            if (skill[i].equals(gogo)) {
                bulga = true;
                break;
            }else {
                bulga = false;
            }
        }
        return bulga;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "skill=" + Arrays.toString(skill) +
                '}';
    }
}
