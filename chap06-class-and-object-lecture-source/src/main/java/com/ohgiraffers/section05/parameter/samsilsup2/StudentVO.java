package com.ohgiraffers.section05.parameter.samsilsup2;

public class StudentVO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;
    public StudentVO(){
        System.out.println("시작");
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
    public void setClassroom(int classroom){
        this.classroom = classroom;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public int getGrade(){
        return grade;
    }
    public int getClassroom(){
        return classroom;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public char getGender(){
        return gender;
    }
    public void printlnformation(){
        System.out.println(grade+classroom+name+height+gender);
    }
}
