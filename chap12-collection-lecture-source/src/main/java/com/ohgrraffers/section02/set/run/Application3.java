package com.ohgrraffers.section02.set.run;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* [TreeSet 클래스 ]

        TreeSet 클래스는 데이터가 절렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다
        이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다
        JDK 1.2 부터 제공되고 있으며
        Set 인터페이스가 가지는 특징을 가지지만정렬된 상태를 유자헌거아 툭징
         */
        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new TreeSet<>();
        tset.add("java");
        tset.add("dbcil");
        tset.add("html");
        tset.add("css");

        System.out.println("tser "+tset);
        Iterator<String> iter = tset.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next().toUpperCase());
        }
        Object[] arr= tset.toArray();

        for (Object obj : arr){
            System.out.println(((String)obj).toString());
        }
        /* 로또 번호 발생 (TreeSet 특징 이용)*/
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size()<6){
            lotto.add(((int)Math.random()*45)+1);
        }
        System.out.println("lotto L "+lotto);
    }
}
