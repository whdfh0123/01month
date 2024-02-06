package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        추상화란
        공통된 부분을 추출하고 공통되지 않은 부분을 제거한다는 의미
        추상화의 목적은 유연성을 확보하기 위함이다
        유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며
        즉 재사용성이 높아질 수 있게 한다
        객체의 재사용성이 증가하면 중복 작성되는 코드를 줄일 수 있으며
        오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다

        시스템 요구사항
        1. 운전자는 시동걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기를 할 수 있다
        2. 자동차는 시동걸기, 앞으로가기, 멈추기, 시동끄기를 할 수 있다
        3. 자동차는 처음에 멈춘 상태로 대기하고 있는다
        4. 운전자는 먼저 자도아에 시동을 건다 이미 걸려있는 경우 다시 시동을 걸 수 없다
        5. 운전자가 엑셀을 밟으면 시동이 걸린 상태일 경우 자동차는 시족이 10km/h 증가하며 전진한다
        6. 자동차가 달리는 중인 경우 브래이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다
        7. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다
        8. 운전자가 시동을 끄면 더 이상 자동차는 음직이지 않는다
        9. 자동차가 달리는 중이란면 시동 끄기 불가능

        <프로그램 설계>
        1. 필요한 객체를 도출
            운전자, 자동차, 플레이어
        2. 객체 간 상호작용
            운전자가 수신할 수 있는 메시지 ( = 운전자가 해야 하는 일)
            --시동걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기
            자동차가 수신할 수 있는 메시지 ( = 자동차가 해야 하는 일)
            --시동걸기, 앞으로가기, 멈추기, 시동끄기
        3. 커뮤니케이션 다이어그램 ( 동적 )
        4. 클래스 설계( 정적 )
            1) carDriver 클래스
                속성 : 자동차( ar 클래스)
                행위 : 시동을 걸어라 , 엘셀밟아라, 브레이크 밟아라, 시동 꺼라
            2) : car 클래스
                속성 : 시동 상태, 현재 시속
                행위 (메소드) : 시동을 걸어라, 아음
         */
        CarDriver driver = new CarDriver();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=========카레이싱 프로그램=========");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : driver.startUp();
                break;
                case 2 : driver.stepAccelater();
                break;
                case 3 : driver.stopBreal();
                break;
                case 4 : driver.sss();
                break;
                case 9 :
                    System.out.println("프로그램 종료합니다");break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다");
                    break;
            }
            System.out.println();
            if (no==9){
                break;
            }
        }
    }
}
