package com.ohgiraffers.section01.extend;

public class FireCar extends Car{  // extends 키워드를 사용하고 상속해줄 클래스명
    //이러면 여기가 상속받는 클래스가 된다 //생성자는 상속받기 불가능
    // private도 접근 불가
    //생성자를 상속받지 못해서 기본생성자 만들어주기
    public FireCar() {
        super();  // 부모의 기본생성차 호출
        System.out.println("FireCar 기본 생성자 호출됨");
    }
    /* @ovrride 어노테이션
    오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다
    오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 자성해야 한다
     */

    @Override // 위에 달아준다
    public void soundHorn(){
        if(isRunning()){ //private의 경우 쓸 수 없음 그래서 pritected로 설정
            System.out.println("삐잉이ㅣㅇ이ㅣ아앙삐이잉ㅇ잉!!!!!!!!");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다 비키세요 비켜!");
        }
    }
    // 물 뿌리는 기능 추가 (원래 Car에는 없던 기능)
    public void spratWater(){
        System.out.println("불난 곳을 발견했씁니다 물을 뿌릴게요");
    }
}
