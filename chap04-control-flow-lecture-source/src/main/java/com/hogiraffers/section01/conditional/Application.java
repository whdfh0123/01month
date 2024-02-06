package com.hogiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
//        a.simpleIfStatment();
//        a.nesredIfStatment();

        B_ifElse b =new B_ifElse();
//        b.siimpleIfElse();    <<그냥 콘솔에서 다음꺼 다 입력하기 귀찮으니까 주석
//        b.nestedIfElseStatement();

        C_ifElseif c = new C_ifElseif();
//        c.simpleIfElseIfStatment();
//        c.nestedIfElseIfStatement();


        D_switch d = new D_switch();
//        d.simpleSwitchStatement();
        d.switchVendingMachine();


    }
}
