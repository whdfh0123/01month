package controller;

import model.dto.Member;
import model.dto.Stock;

import java.util.Scanner;

public class StockManager {
    Scanner sc = new Scanner(System.in);
    private Member member;
    private Stock[] stockList = new Stock[10];
    {
        stockList [0] = new Stock("삼성전자", 73300);
        stockList [1] = new Stock("SK하이닉스", 149600);
        stockList [2] = new Stock("LG에너지솔루션", 404000);
        stockList [3] = new Stock("삼성바이오로직스", 818000);
        stockList [4] = new Stock("삼성전자우", 62900);
        stockList [5] = new Stock("현대차", 242000);
        stockList [6] = new Stock("기아", 116100);
        stockList [7] = new Stock("셀트리온", 179900);
        stockList [8] = new Stock("POSCO홀딩스", 440000);
        stockList [9] = new Stock("LG화학", 506000);
    }
    public void insertMember(Member member){
        this.member = member;
    }
    public Member myInfo(){
        return member;
    }
    public void displayAll(){
        for (int i = 0; i<stockList.length;i++){
            System.out.println(i+"번 "+stockList[i]);
        }
    }
    public void inputMoney(){
        System.out.println("얼마를 추가로 입금할까요?");
        int addmoney = sc.nextInt();
        sc.nextLine();
        member.addMoney(addmoney);
    }
    public void buyStock(int buy){
        if(member.getMoney()>=stockList[buy].getPrice()){
            member.setMoney(member.getMoney()-stockList[buy].getPrice());
            member.setBoueList(stockList);
        }else if(member.getMoney()<stockList[buy].getPrice()){
            System.out.println("구매가 불가합니다");
        }
    }

}
