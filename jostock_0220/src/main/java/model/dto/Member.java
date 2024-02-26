package model.dto;

import java.util.Arrays;

public class Member {
    private String name;
    private int Money;

    private Stock[] boueList = new Stock[100];
    public Member(String name, int money) {
        this.name = name;
        Money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
    public void addMoney(int Money){
        this.Money = this.Money + Money;
    }

    public Stock[] getBoueList() {
        return boueList;
    }

    public void setBoueList(Stock[] boueList) {
        this.boueList = boueList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", Money=" + Money +
                ", boueList=" + Arrays.toString(boueList) +
                '}';
    }
}
