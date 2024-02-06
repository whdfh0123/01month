package com.ohgiraffers.section05.parameter.samsilsup1;

public class BookVo {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;
    //생성자 =============================================================
    public BookVo(){
        System.out.println("기본생성자");
    }
    public BookVo(String title, String publisher, String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    public BookVo(String title, String publisher, String author, int price, double discountRate){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;

    }
    // 여기부터 설정자 ========================================================
    public void setTitle(String title){
        this.title = title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public String getTitle(){
        return title;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public double getDiscountRate(){
        return discountRate;
    }
    //여기는 입력된값 한번에 출력하기
    public String printlnformation(){
        return title+", "+publisher+", "+author+", "+price+", "+discountRate;
    }

}
