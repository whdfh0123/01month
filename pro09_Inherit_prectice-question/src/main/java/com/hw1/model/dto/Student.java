package com.hw1.model.dto;

public class Student extends Person{
    private int grade;
    private String major;

    public Student(){
        super();
    }
    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age,height,weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public int getGrade(){
        return grade;
    }
    public String getMajor(){
        return major;
    }
    public String getInformation(){
        return super.getInformation()+
        ", 학년 : "+grade+", 전공 : "+major;
    }
}
