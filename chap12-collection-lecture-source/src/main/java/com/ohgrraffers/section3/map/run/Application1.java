package com.ohgrraffers.section3.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        //[ map 인터페이스 특징
//        Collection 인터네이스와 다른 저장 방식을 가진다
//        키와 값(Valee)를 하나호  쌍으로 저장하는 방식으로 사용한다

        /* 키 란
        값을 찾기 위한 이름 역할을 하는 객체를 의미한다
        1. 요소의 저장 순서를 유지하지 않는다
        2. 키는 중복을 허용하지 않지만 키가 다르면 중복되는 값은 저장 가능
        HashMAp, HashTablr, Treemap 등의 대표적인 클래스 존재
        HashMAp이 가장 많이 사용
         */
        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12,"red apple");
        hmap.put(33, 123);
        // autoBaxing처리됨 12 -> new Integer(12)

        System.out.println(hmap);

        // 키는 중복 저장 되지 않음(Set) : 최근 키로 override됨(덮어쓴다)
        hmap.put(12, "yellow bannna");
        System.out.println(hmap);

        hmap.put(11, "yellow banana");
        hmap.put(9,"yellow banana");
        System.out.println("hmap " + hmap);

        // 키로 검색을 해서 출력해준다
        System.out.println("키 9에 대한 객체 : "+hmap.get(9));


        // 키로 삭제하면 다 삭제
        hmap.remove(9);
        System.out.println("hmap : "+hmap);
        System.out.println("hmap에 저장된 객체 수 : "+hmap.size());

        // 2개의 값이 있어야한다 (키, 값 따로 저장)
        HashMap<String,String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 8");
        hmap2.put("two", "mySql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        // 이더레이터 쓰면 이더레이터로 반환
        Iterator<String> keyIter = hmap2.keySet().iterator(); //키값을 가져온다 keyset
        while ((keyIter.hasNext())){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = "+value);
        }
//        hmap2.values(); //values 값들을 가져오는 메소드
        Collection<String> values = hmap2.values();
        Iterator<String> valueIter = values.iterator();
        // 위에걸 줄이면 이렇다
//        Iterator<String> valueIter = hmap2.values().iterator();

        //다음 요소가 있는 한 다음 요소를 반환한다
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());
        }
        Object[] valueArr = values.toArray();
        for (int i = 0; i<valueArr.length; i++){
            System.out.println(i+" : "+valueArr[i]);

        }
        // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        // Entry는 java.util.Map 인터페이스의 내부 인터페이스로 Map 안의 키-값쌍을 나타낸다
        // [entrySet() : Map에 저장된 모든 키-값 쌍(Entry)를 Set 형태로 반환한다
        // getKey()와 getValue() 메소드를 제공하여 키와 값을 각각 가져올 수 있다
        // Map.Entry 객체는 하나의 키와 값에 대한 참조를 제공하며 이를 통해 특정 Map항목의 키 or 값을 가져오거나 설정할 수 있다

        Iterator<Map.Entry<String,String>> entryIterator = hmap2.entrySet().iterator();
//        Set<Map.Entry<String,String>> set = hmap2.entrySet();
//        Iterator<Map.Entry<String,String>> entryIter = set.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
