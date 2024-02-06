package com.ohgiraffers.section05.parameter.samsilsup1;

public class Application {
    public static void main(String[] args) {
        BookVo bookVo1 = new BookVo();
        System.out.println(bookVo1.printlnformation());
        BookVo bookVo2 = new BookVo("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookVo2.printlnformation());
        BookVo bookVo3 = new BookVo("홍", "활빈", "허", 50000, 0.1);
        System.out.println(bookVo3.printlnformation());

        bookVo1.setTitle("홍2");
        bookVo1.setPublisher("활빈2");
        bookVo1.setAuthor("허2");
        bookVo1.setPrice(30000);
        bookVo1.setDiscountRate(0.3);
        //get으로 얻은 값 출력하기
        System.out.println(bookVo1.getTitle());
        System.out.println(bookVo1.getPublisher());
        System.out.println(bookVo1.getAuthor());
        System.out.println(bookVo1.getPrice());
        System.out.println(bookVo1.getDiscountRate());
        System.out.println(bookVo1.printlnformation());

    }
}
