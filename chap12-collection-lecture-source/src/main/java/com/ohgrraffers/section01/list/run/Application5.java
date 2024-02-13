package com.ohgrraffers.section01.list.run;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* [ Queue ]
        Queue는 선형 메모리 공간에 데이터를 저장하는
        선입선출 방식의 자료구조이다
        인터페이스를 상속받는 하위 인터페이스들은
        Deque, Blocko, 등 다양하지만
        대부분의 큐는 LinkedList를 이용한다

        Queue자체론 인터턴스라 생성불가*/
//        Queue<String> qwe=new Queue<String>(
        Queue<String> que = new LinkedList<>();
                que.offer("as");
                que.offer("ss");
                que.offer("33");


            //peek() : 해당 큐의 가장 앞에 있는 요소 반환
//            /poll() : 해당 큐의 가장 앞에 있는 요소 반환 후 제거


        System.out.println(que.peek());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que);
    }
}
