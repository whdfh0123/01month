package com.ohgiraffers.section06.singleton;

public class LazySingleton {
    //클래스가 초기화 되는 시점에 필드를 선언해두고 null로 초기화된다
    //이른건 선언하고 바로 초기화했지만 이건 선언만 한다

    private static LazySingleton lazy;
    private LazySingleton(){}
    // 이건 나중에 생성하지 않았을 경우 나중에 생성하는 걸로 만들어줌
    public static LazySingleton getInstance(){
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
