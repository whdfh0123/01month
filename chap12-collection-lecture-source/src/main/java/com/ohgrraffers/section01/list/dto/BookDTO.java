package com.ohgrraffers.section01.list.dto;

public class BookDTO {

    private int number;
    private String title;
    private String auther;
    private int price;

    public BookDTO(int number, String title, String auther, int price) {
        this.number = number;
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }
}
