package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class UserDTO {
    /*자바빈 (Java Bean) 이란?
    JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스이다
    자바 코드를 모르는 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데
    그 떄사용할 수 있도록 규칙을 지정해놓은 java클래스를 자바빈이라 부른다
    걀국 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 된다

    [자바빈 작성 규칙]
    1. 자바빈은 특정 패키지에 속해있어야함 (default 패키지 사용금지)
    2. 멤버변수의 접근제어자는 private로 선언해야함
    3. 기본생성자가 명시적으로 존재헤야함 (매개변수 있는 생성자는 선택사항)
    3. 모든 멤버변수에 접근 가능한 설정자(setter와 접근자(getter)가 public으로 작성되어 있어야함
     */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;
    public UserDTO(){      // 이게 기본생성자

    }
    //생성자
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }
    //설정자(setter)
    public void setId(String id){
        this.id = id;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEnrollDate(java.util.Date enrollDate){
        this.enrollDate = enrollDate;
    }
    /* 접근자 ( geteet)*/
    public String getId(){
        return id;
    }
    public String getPwd(){
        return pwd;
    }
    public String getName(){
        return name;
    }
    public java.util.Date getEnrollDate(){
        return enrollDate;
    }
    public String getInfomation(){
        return "User [ id = "+this.id+", pwd = "+this.pwd+", name = "+this.name+", enrollDate = "+this.enrollDate;
    }
}
