package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {
        /* 초기화 블럭
        1. 인스턴스 초기화 블럭
            인스턴스가 생성되는 시점에 생성자 호출 이전에 실행이 된다
            인스터느를 호출하는 시점마다 호출이 된다
            인스턴스변수를 초기화하여 정적필드에는 실핼시점마다
            값을 덮어쓴다
        {초기화 내용 작성
        }
        2. 정적 초기화 블럭
        클래스가 로드될 때 한번 동작한다
        정적필드를 초기화하며, 인스틴스변수는 초기화하지 ㅇ못한다
        static {
        초기화 내용 작성
        }
         */
        Product product = new Product();
        // 초기화 블럭이 명시적 초기값을 덮어 쓴다
        System.out.println(product.getInformatin());

        Product product2 = new Product("캐모마일차", 4200, "투썸");
        System.out.println(product2.getInformatin());
    }
}
