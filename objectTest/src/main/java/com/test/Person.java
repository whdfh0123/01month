package com.test;

import java.util.Scanner;

public class Person {
    /* 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) ---캡슐화*/
    // 강아지 이름을 입력받고 입력받은 이름을 속성으로 강아지 객체 생성하여
    // 이 사람의 강아지로 설정
    private String name;
    private int age;
    private String con;
    private String[] cons = new String[5];

    private Dog myDog;

    Scanner sc = new Scanner(System.in);

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCon() {
        return con;
    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    // 선생님방식 = String[] 국적배열 만든 후 반복문 조건문작성
    public void setCon(String con) {
        cons[0] = "한국";
        cons[1] = "일본";
        cons[2] = "중국";
        cons[3] = "홍콩";
        cons[4] = "터키";

        for(int i = 0; i < cons.length; i++){
            if (cons[i].equals(con)){
                this.con = con;
                break;
            }else {
                this.con = "한국";
            }
        }
//        if(con == "한국"||con == "일본"||con=="중국"||con=="홍콩"||con=="터키"){
//            this.con = con;
//        }else {
//            this.con = "한국";
//        }

    }
    public void adoptDog(){
        System.out.print("강아지 이름을 입력하세요 : ");
        Dog dog1 = new Dog(sc.nextLine());
        setMyDog(dog1);
//        System.out.println("당신의 강아지 이름은 : "+myDog.getName()); 다른 메소드로 출력하기
    }
    public void teachDog(String[] skill){
        //내 강아지의 재주를 설정
        myDog.learnSkill(skill);

    }
    public void info(){
        myDog.dogInfo();
    }
    public void gogo(){
        System.out.println("어떤 재주를 시켜볼까 : ");
        String goskill = sc.nextLine();
        myDog.doSomeThingVoid1(goskill);
//        if(b==true){
//            System.out.println("강아지는 "+s+"를 할 수 있어요");
//        }else if(b==false){
//            System.out.println("강아지는 "+s+"를 할 수 없어요");
//        }
    }
}
