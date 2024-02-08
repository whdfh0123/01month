package com.ogiraffers.section01.object.run;

//import java.awt.print.Book; ??? 자동 임포트가 된 잘못된 임포트
import com.ogiraffers.section01.object.book.Book;
public class Application2 {
    public static void main(String[] args) {
        /* equals()메소드 오버라이딩
        equals 메소드는 매개션수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다
        즉 동일한 인스턴스인지를 비료하는 기능을 한다

        동일객체 : 주소가 동일한 인스턴스를 동일객체 라고 한다
        동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등각체라고 한다
         */


        Book book1 = new Book(1,"홍길동전", "허균",50000);
        Book book2 = new Book(1,"홍길동전", "허균",50000);

        System.out.println("두 인스턴스의 == 연산 비교 : "+(book1==book2));
        System.out.println("두 인스턴스의 equals 비교 : "+(book1.equals(book2))); //원래는 false의 값이 나오다가
        // equals를 재정의하여 주소값이 아닌!!! 안에 필드의 값이 일치하는지 비교를 하고 결과를 돌려주게 하여
        //값이 true가 나왔다
    }
}
