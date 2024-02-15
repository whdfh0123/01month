package com.ohgrraffers.section02.set.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {
        /* [Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징 ]
        1. 요소의 저장 순서를 유지하지 않는다
        2. 같은 요소의 중복 저장을 허용하지 않는다

        [ HashSet 클래스 ]
        Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다
         JDK1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다
         */

        HashSet<String> hset = new HashSet<>();
        //일단 밑에건 두고 위에꺼 먼저 진행
//        Set hset2 = new HashSet();
//        Collections hset3 = new HashSet();
        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset : "+hset);
        hset.add("java"); // 같은 값이 에러는 안뜨지만 추가가 안된상태
        System.out.println("hset : "+hset);
        System.out.println("저장된 객체수 " +hset.size());
        System.out.println("포함확인 : "+ hset.contains("oracle"));
        //toArray() : HasgSet 에 저장된 모든 요소를 포함하는 새로운 'Object타입의 배열 반환
        Object[] arr = hset.toArray();  // 오브젝트
        for (int i = 0; i<arr.length; i ++){
            System.out.println(i + " : "+ arr[i]);
        }

        // iterator() : Collection 인터페이스의 메소드로 Collection에 저장된 요소들을
        //              순차적으로 접근하는데 사용되는 Iterator를 반환한다
        Iterator<String> iiter = hset.iterator();
        while (iiter.hasNext()) {
            System.out.println(iiter.next());   // 다음 요소가 없으면 실패하는 hasNext롸 .next로 출력한다
        }
        hset.clear();  // 요소 지우기 다 없어진다
        System.out.println("empty? : "+hset.isEmpty());
    }
}
