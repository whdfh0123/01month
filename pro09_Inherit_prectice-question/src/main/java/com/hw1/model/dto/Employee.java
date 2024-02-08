package com.hw1.model.dto;

public class Employee extends Person{
    private int salary;
    private String dept;
    public Employee(){}
    public Employee(String name, int age, double height, double weight, int salary, String dept){
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }
    public void setname(String name){
        super.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public int getSalary(){
        return salary;
    }
    public String getDept(){
        return dept;
    }
    public String getInformation(){

        return super.getInformation()+", 급여 : "+salary+", 부서 : "+dept;
    }
}
