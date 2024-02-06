package silsup2;

import java.util.Scanner;

public class jomain {
    public static void main(String[] args) {
        johumen hu = new johumen();
        Scanner sc = new Scanner(System.in);
        System.out.println("1번 물주기");
        System.out.println("2번 햇빛주기");
        while(true){
            System.out.print("번호를 입력하세요 : ");
            int i = sc.nextInt();
            switch (i){
                case 1 : hu.waterGive();
                    break;
                case 2 : hu.sunGive();
                    break;
                default:
                    System.out.println("숫자를 다시 입력하세요");

            }
            if(hu.pl.shmePhp() == 100){
                System.out.println("꽃이 피었습니다 프로그램 종료");
                break;
            }else if(hu.pl.shmePhp()==0){
                System.out.println("시들었어요 다시 살려주세요 프로그램 종료");
                break;
            }
        }


    }
}
