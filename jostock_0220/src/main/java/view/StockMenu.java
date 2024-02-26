package view;

import controller.StockManager;
import model.dto.Member;

import java.util.Scanner;

public class StockMenu {
    Scanner sc = new Scanner(System.in);
    StockManager sm = new StockManager();
    int mainNum;
    public void mainPage(){
        String name;
        int money;
        System.out.println("정보를 입력하세요");
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("보유현금 : ");
        money = sc.nextInt();
        sc.nextLine();
        Member member1 = new Member(name, money);
        sm.insertMember(member1);
        while (true){
            System.out.println("===메인 메뉴===");
            System.out.println("0. 프로그램 종료");
            System.out.println("1. 전체 주식 보기");
            System.out.println("2. 내정보확인");
            System.out.println("3. 현금 추가입금");
            System.out.println("4. 주식 구매");
            System.out.println("5. 주식 판매");
            System.out.println("어떤 메뉴를 실행할까요?");
            mainNum = sc.nextInt();
            sc.nextLine();
            if(mainNum==0){
                break;
            }
            switch (mainNum){
                case 1 :
                    sm.displayAll();
                    break;
                case 2 :
                    System.out.println(sm.myInfo());
                    break;
                case 3 : sm.inputMoney();
                    break;
                case 4 : buyStock();
                    break;
                case 5 : break;
            }
        }
    }
    public void buyStock(){
        sm.displayAll();
        System.out.println("구매할 주식 선택");
        int buyNum = sc.nextInt();
        sc.nextLine();
        sm.buyStock(buyNum);
    }
}
