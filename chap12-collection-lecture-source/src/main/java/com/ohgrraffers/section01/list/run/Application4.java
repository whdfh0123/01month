package com.ohgrraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* [ stack ]
        Stack은 리스트 계열 클래스의 Vector클래스를 상속 받아 구현하였다
        스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        후입선출(LIFO - Last Input First Out) 방식의 자료 구조라 불린다

         */
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1); // 여기서는 add도 가능하지만 push 선호
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println(integerStack);
        System.out.println(integerStack.search(5)); // 후입선출로 뒤에서 5등인 1출력
        /* stack에서 값을 꺼내는 메소드
        peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환
        pop() : 해당 스택의 가장 마지막에 있는(상던에 있는) 요소 반환 후 제거
         */
        System.out.println("peek() : "+integerStack.peek());
        System.out.println(integerStack);
        System.out.println("peek() : "+ integerStack.pop());
        System.out.println("peek() : "+ integerStack.pop());
        System.out.println("peek() : "+ integerStack.pop());
        System.out.println("peek() : "+ integerStack.pop());
        System.out.println("peek() : "+ integerStack.pop());
        //하나씩 제거해서 마지막엔 오류 발생
    }
}
