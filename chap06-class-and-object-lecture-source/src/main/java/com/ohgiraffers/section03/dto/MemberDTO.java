package com.ohgiraffers.section03.dto;

public class MemberDTO {
    private int number; //회원번호
    private String name; //회원명
    private int age; //나이
    private char gender; //성별
    private double height; //키
    private double weight; //몸무게
    private boolean isActivated; //회원 탈퇴 여부 (활성화 여부)

    /* [setter 작성 규칙 ]
     필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다
     [ setter 표현식 ]
     public void set필드명(매개변수) {
     필드 = 매개변수;
     }
     [작성예시]
     public void setName(String name){
     this.name = name;
     }

     [ getter 작성 규칙 ]
     필드의 값을 반환받을 목적의 메소드 집합으로 각 접근자는 하나의 필드에서만 접근하도록 한다
      ㅠㅣㄹ드에 접근해서 기록된 값을 return 을 이용하여 반환하며 이때 반환타입은 반환하려는 값의 자료형과 일피시긴다
      [ getter 표현식]
      public 반환형 get필드명(){
      return 반환값;
      }
      [작성예시]
      public String getName(){
        return this.name;
        }

     */
    public void setNumber(int number){
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public  void setActtivsted(boolean isActivated){
        this.isActivated = isActivated;
    }
    public int getNumber(){return number;}
    public String getName(){return name;}
    public int getAge(){return age;}
    private char getGender(){return gender;}

    public double getHeight() {
        return height;
    }
    public double getWeight(){
        return weight;
    }
    //boolean 의 접근자는 get이라라 시작하지 않고 is로 시작하는 것이 일반적
    public boolean isActtivsted(){
        return isActivated;
    }
}
