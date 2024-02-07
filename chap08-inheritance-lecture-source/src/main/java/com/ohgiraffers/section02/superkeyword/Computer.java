package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;


    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출함");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스 모든 필드를 초기화라는 생성자 초훌함");

    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드도초기화하는 생성자 호출함");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    @Override
    public String getInformation(){
        return super.getInformation() // super.get ~~으로 하나하나 불러올 수 있다 //this. 으로 하면 스택오버플로우로 오류남
                // super를 꼭 작성해야 한다
                + " Computer {"
                +"cpu = "+this.cpu
                +"hdd = "+this.hdd
                +", ram"+this.ram
                +", operationSystem = "+this.operationSystem
                + " ]";
    }
}
