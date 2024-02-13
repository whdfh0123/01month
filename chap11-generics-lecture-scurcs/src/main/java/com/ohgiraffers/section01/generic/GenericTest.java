package com.ohgiraffers.section01.generic;

public class GenericTest<T> {
    // 다른 영문자도 가능 대문자로 쓰기

    private T value;
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
