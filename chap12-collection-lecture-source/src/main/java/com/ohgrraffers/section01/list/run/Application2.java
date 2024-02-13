package com.ohgrraffers.section01.list.run;

//import com.ohgrraffers.section01.list.compartor.AscendingPrice.AscendingPrice;
import com.ohgrraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>();

        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2,"목민심서", "정양욕",30000));
        bookDTOList.add(new BookDTO(3,"동의보감","허쥰",40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식",46000));
        bookDTOList.add(new BookDTO(5,"삼국유사","일연",58000));

        for(BookDTO i : bookDTOList){
            System.out.println(i);
        }

//        가격 오름차순 정렬하기 코드 보고 다시 해보자
//        bookDTOList.sort(new AscendingPrice());
//        bookList.sort(new AscendingPrice());
        for (BookDTO i : bookDTOList){
            System.out.println(i);
        }
        // 익명 클래스(Anonymous)
        // 익명클래스는 뒤에 {} 를 만들어 마치 Comparator 인터페이스를 상속받은 클래스인데
//        이름이 없다고 생각하고 사용하는 것이다

        //인터페이스는 여기에 객체 생성을 바로 할 수 없다 (상속을 받고 사용)
//        bookDTOList.sort(new Comparator<BookDTO>());

        // 상속을 받고  있다고 생각하고 사용하는게 익명 클래스
        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {

                return o1.getPrice()>= o2.getPrice()?-1:1;
            }
        });
        System.out.println("=============== 가격 내림차순 정렬   =============");
        for (BookDTO bookDTO : bookDTOList){
            System.out.println(bookDTO);
        }

        bookDTOList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                /* 문자열은 대소비교를 할 수 없다
                문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느것이 더 큰 갑인지 확인해야 하는데
                String클래스의 CompareTo()메소드에서 정의해 놓았다

                앞의 값이 더 작은 경우 음수 반환
                간으면 0
                앞의 겂이 더 크면 양수 반환
                 */
                return o1.getTitle().compareTo(o2.getTitle());

            }
        });
        System.out.println(" 책 제목 오름차순 정렬");
        for (BookDTO book : bookDTOList){
            System.out.println(book);
        }
        /* 람다식을 활용할 수 있다 이용해서 내림차순으로 정렬해보기*/
        bookDTOList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));
        System.out.println(" 책 제목 내림차순 정렬");
        for (BookDTO book : bookDTOList){
            System.out.println(book);
        }
    }
}
