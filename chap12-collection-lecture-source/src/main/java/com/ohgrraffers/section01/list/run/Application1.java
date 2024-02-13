package com.ohgrraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        // [ 컬렉션 프레임워크(colllret Framework
        // 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        //표준화된 방법을 제공하는 클래스들의 집한
        // 즉 데이터를 효과적으로 저장허는 자료구조와 데이터를 처라하는 알고리즘을 미리
        //구혀내놓은 클래스

        //크게 3가지 인터페이스중 한 가지를 상속 받아 구현해 놓았다

        /*
        1. 리스트
        2. set
        3 map
        리스트인터페이스와 세트 인터페이스의 공통 부분을 콜렉션 인터페이스에서 정의하고 았다
        하지만 map은 구조상의 차이라 컬렉션 인터페이스에서 정의하지 않았다

        [ list ]인터페이스
        순서 있는 데이버 집합으러 데이터의  중복 저장을 허용한다
        vector, ArrayList, LinkedList, Stack ,Queue 등이 있다
        [ set ]
        순서가 없는 데이터의 집합으러 데이터 중복 저장을 허용X
        Hashset, Treeswt

        [map] 인터페이스
        카와 값 한 쌍으로 이루어지는 데이터 집합
        key를 set반식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용X
        Value는 중복된 값을 저장할 수 있다
        HashMap, Treemap, HashTable, Properties등이 있다

         */
        /* [ArrayList]
        배열을 단점을 보완하기 위해 만들어졌다
        배열은 크기를 변경할 수 없고 요소의 추가 , 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다
        ArrayList는 저러한 배열의 단점을 보완하고자 크기변경 (새로운 더 큰 배열 만들고 옮기기)
        요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다
        자동적으로 수행하는 것이지 속도가 발라지는것은 아니다
         */
        // ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성, 관리한다
        ArrayList alist = new ArrayList();  // 자동 임포트
        List list = new ArrayList(); //      이렇게도 가능 List타입
        Collection clist =new ArrayList();

        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new Date());  // 순서도 입력한 대로 유지중

        System.out.println("alist : "+alist);
        System.out.println("alist 사이즈 : "+ alist.size()); //이렇게 확인가능

        for (int i = 0; i<alist.size();i++){
            System.out.println(i + " : "+alist.get(i));

        }
        alist.add("apple");
        System.out.println("alist : "+alist);  // 뒤에 똑같은 값이 더 붙음
        System.out.println("alist 사이즈 : "+ alist.size()); //이렇게 확인가능
        alist.add(1,"banana");  // 인덱스를 덮는게 아니라 원래 값들을 뒤로 밀고 저장함
        System.out.println("alist : "+alist);

        alist.remove(2);  // 삭제하고 싶은 인덱스를 지정해 삭제
        System.out.println("alist : "+alist);

        alist.set(1,Boolean.valueOf(true)); //valueOf :  boolean <-> Boolean 인스턴스화 형식변환
//        alist.set(1,true); // 이렇게 해도 오토박스로 그대로 값이 들어감 위의 과정 생략
        // 인덱스 수정하기
        System.out.println("alist : "+alist);  // 값 수정으로 1번자리 바뀜

        // 지정한 타입 외에는 저장불가
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);  // 스트링으로 지정해서 정수 불가
        stringList.add("banna");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println(stringList);
        Collections.sort(stringList);  //오름차순으로 바꿔주기
        System.out.println(stringList);

        stringList = new LinkedList<>(stringList); //형변환 링크드로 해줌 으로 알기

        /* Iterator
        Collection  인터페이스의 iterator()메소드를 이용해서 인스턴스를 생성할 수 있다
        반복자라고 불리우며 반복문을 이영해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다
        인덱스로 관리되는 컬렉션이 아닌 경우레는 반복문을 사용해서 요소애 허너씩 접근할 수 없기 때문에
        인덱스를 사용하지 않고도 반복문을 사용허기 위한 목록을 만들어주는 역할이라고 보면 된다
        hasNext() : 다음 요소를 가지고 있는 경우 true 더 이상 요소가 없는 경우 false를 반환
        next() : 다음 요소를 반환

         */
        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator(); //또 형변환 링크드로 Iterator로 역순으로 저장

        List<String> decsList = new ArrayList<>();
        while (dIter.hasNext()){
            decsList.add(dIter.next());
        }
        System.out.println("descList : "+decsList);  // 역순으로 정렬된거 출력


    }
}
