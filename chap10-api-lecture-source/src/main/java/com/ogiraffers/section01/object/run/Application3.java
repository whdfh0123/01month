package com.ogiraffers.section01.object.run;

import com.ogiraffers.section01.object.book.Book;

public class Application3 {
    public static void main(String[] args) {
        // hachCode()메소드 오버라이딩
        // Object클래스의 명세에 작성된 일반 규약에 따르면
        //equals()메소드를 재정의 하는 경우 반드시 hashCode()메소드도 재정의 하도록 되어있다
        //만약  hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
        //같은 해시코드값을 가져야 한다는 규약애 위반되게 된다 (강제성은 없지만 규약대로 작성하는 것이 좋다)

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        // 동일한 값을 가지고 있지만 객체가 다르기 때문에 해시코드는 다르다
        //이 경우 같은 값을 가지면 동등한 객체로 만들어주고 사용하는 때도 있다
        // 그래서 해시코드를 재저으이 해준다


        System.out.println("book1의 해시코드 : "+book1.hashCode());
        System.out.println("book2의 해시코드 : "+book2.hashCode());
    }
}
